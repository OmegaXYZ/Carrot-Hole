<template>
    <div id="home">

        <!-- breadcrumb -->
        <nav class="text-sm font-semibold mb-6" aria-label="Breadcrumb">
            <ol class="list-none p-0 inline-flex">
                <li class="flex items-center text-blue-500">
                    <a href="#" class="text-gray-700">主页</a>
                    <svg class="fill-current w-3 h-3 mx-3" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512">
                        <path
                            d="M285.476 272.971L91.132 467.314c-9.373 9.373-24.569 9.373-33.941 0l-22.667-22.667c-9.357-9.357-9.375-24.522-.04-33.901L188.505 256 34.484 101.255c-9.335-9.379-9.317-24.544.04-33.901l22.667-22.667c9.373-9.373 24.569-9.373 33.941 0L285.475 239.03c9.373 9.372 9.373 24.568.001 33.941z" />
                    </svg>
                </li>
                <li class="flex items-center">
                    <a href="#" class="text-gray-600">帖子详情</a>
                </li>
            </ol>
        </nav>

        <div v-if="commentList">
            <div v-for="(item,index) in commentList" class="flex flex-wrap -mx-3 items-center justify-center">
                <div
                    class="min-h-[10rem] w-full lg:w-5/6 rounded-md border border-sky-400 bg-opacity-25 bg-cyan-40 p-3 m-2 flex">
                    <!-- <div class="w-1/6 bg-opacity-25 bg-cyan-100 flex flex-col flex-wrap items-center justify-center"> -->
                        <!-- <ul class="w-20 h-20 bg-cyan-100">
                            <img src="../../public/favicon.ico" alt="我是图片" class="w-full h-full object-cover inset-0">
                        </ul> -->
                        <!-- <ul>{{ }}</ul> -->
                    <!-- </div> -->

                    <div class="flex-grow flex flex-wrap p-3 whitespace-pre-line">
                        <!-- <p> 大家什么时候举办线下聚会？一群猪他飞上了天 一群海盗淹死在沙滩 我的儿子倍做成了金钱，摇曳的花枯萎在河岸哪。。。允许我家的佣人先富起来</p> -->
                        <p> {{ commentList[index].commentContent}}</p>
                        <!-- <div class="border-t-2 border-cyan-600"></div> -->
                        <div class="w-full border-t-2 border-cyan-600"></div>
                        <div class="mt-auto flex justify-end">
                            <p>{{ index}}楼 {{ }}</p>
                        </div>

                    </div>
                </div>
                <!-- <PreviewPoster /> -->
            </div>
        </div>
        <div class="bg-white rounded-lg border-t-2 p-6 m-6 shadow-md" v-if="ShowReviewPart">
            <form>
                <div class="flex items-start">
                    <div class="flex-1">
                        <div class="mb-2">
                            <textarea name="commentText" placeholder="发表一条友善的评论"
                                class="w-full p-2 rounded border border-gray-300" rows="4" required></textarea>
                        </div>
                        <button type="submit"
                            class="bg-blue-500 text-white py-2 px-4 rounded hover:bg-blue-600">提交评论</button>
                    </div>
                </div>
            </form>
        </div>

    </div>
</template>

<script>
import { Chart } from 'chart.js'
import PreviewPoster from '../components/PreviewPoster.vue'
import FullPoster from '../components/FullPoster.vue'
import {
    getPostByIdAPI,
    getPostListAPI,
    getPostCommentListAPI,
} from "../utils/request.js";

export default {
    name: 'PostPage',

    data() {
        return {
            commentList: null,
            ShowReviewPart: true,
            buyersData: {
                type: 'line',
                data: {
                    labels: ["Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"],
                    datasets: [{
                        backgroundColor: "rgba(99,179,237,0.4)",
                        strokeColor: "#63b3ed",
                        pointColor: "#fff",
                        pointStrokeColor: "#63b3ed",
                        data: [203, 156, 99, 251, 305, 247, 256]
                    },
                    {
                        backgroundColor: "rgba(198,198,198,0.4)",
                        strokeColor: "#f7fafc",
                        pointColor: "#fff",
                        pointStrokeColor: "#f7fafc",
                        data: [86, 97, 144, 114, 94, 108, 156]
                    }]
                },
                options: {
                    legend: {
                        display: false
                    },
                    scales: {
                        yAxes: [{
                            gridLines: {
                                display: false
                            },
                            ticks: {
                                display: false
                            }
                        }],
                        xAxes: [{
                            gridLines: {
                                display: false
                            }
                        }]
                    }
                }
            },
            reviewsData: {
                type: 'bar',
                data: {
                    labels: ["Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"],
                    datasets: [{
                        backgroundColor: "rgba(99,179,237,0.4)",
                        strokeColor: "#63b3ed",
                        pointColor: "#fff",
                        pointStrokeColor: "#63b3ed",
                        data: [203, 156, 99, 251, 305, 247, 256]
                    }]
                },
                options: {
                    legend: {
                        display: false
                    },
                    scales: {
                        yAxes: [{
                            gridLines: {
                                display: false
                            },
                            ticks: {
                                display: false
                            }
                        }],
                        xAxes: [{
                            gridLines: {
                                display: false
                            }
                        }]
                    }
                }

            }
        }
    },
    components: {
        PreviewPoster,
        FullPoster
    },
    created() {
        getPostCommentListAPI(0).then(response => {
            console.log('响应数据：', response.data.commentList);
            this.commentList = response.data.commentList;
        })
        // this.getPostById();
        // this.getPostList();
        // this.getPostCommentList();
    },
    // mounted() {
    //     new Chart(document.getElementById('buyers-chart'), this.buyersData)
    //     new Chart(document.getElementById('reviews-chart'), this.reviewsData)
    // }

}
</script>