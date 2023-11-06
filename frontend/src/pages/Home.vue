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
                    <a href="#" class="text-gray-600">浏览帖子</a>
                </li>
            </ol>
        </nav>
        <!-- breadcrumb end -->

        <div class="lg:flex justify-between items-center mb-6">
            <p class="text-2xl font-semibold mb-2 lg:mb-0">早上好, 洛天依小姐!</p>
            <button
                class="bg-blue-500 hover:bg-blue-600 focus:outline-none rounded-lg px-6 py-2 text-white font-semibold shadow">发布主题帖</button>
        </div>

        <div v-for="(item, index) in 10" class="flex flex-wrap -mx-3 items-center justify-center">
            <div class="h-35 w-full lg:w-4/5 rounded-md border border-sky-400 bg-opacity-25 bg-cyan-40 p-3 m-2">
                <div class="rounded-md h-1/4 w-full bg-opacity-25 mb-5">
                    <p class="text-3xl font-semibold">
                        <router-link to="/Post/home">
                            前往对应帖子详情页面
                        </router-link>
                    </p>
                </div>
                <div class="border-t-2 border-cyan-600 my-1"></div>
                <div class="rounded-md h-1/2 w-full bg-opacity-25 p-1">
                    <p class="text-md">
                        <strong class="font-bold">user: </strong>
                        post:content
                    </p>
                </div>
            </div>
        </div>



    </div>
</template>

<script>
import { Chart } from 'chart.js'
//import PreviewPoster from '../components/PreviewPoster.vue'


export default {
    name: 'DashboardHome',
    data() {
        return {
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
        PreviewPoster
    },
    mounted() {
        new Chart(document.getElementById('buyers-chart'), this.buyersData)
        new Chart(document.getElementById('reviews-chart'), this.reviewsData)
    }

}
</script>