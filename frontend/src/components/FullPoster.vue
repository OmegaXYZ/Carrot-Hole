<template>
    <div class="h-40 w-full lg:w-5/6 rounded-md border border-sky-400 bg-opacity-25 bg-cyan-40 p-3 m-2 flex">
        <div class="w-1/6 bg-opacity-25 bg-cyan-100 flex flex-col flex-wrap items-center justify-center">
            <!-- <div class="w-20 h-20 bg-cyan-100"></div> -->
            <ul class="w-20 h-20 bg-cyan-100">
                <img src="../../public/favicon.ico" alt="我是图片" class="w-full h-full object-cover inset-0">
            </ul>
            <ul>包包大人</ul>
            <!-- <p class="break-words">xsax</p> -->
        </div>

        <div class="flex-grow flex flex-wrap p-3">
            <p> 大家什么时候举办线下聚会？一群猪他飞上了天 一群海盗淹死在沙滩 我的儿子倍做成了金钱，摇曳的花枯萎在河岸哪。。。允许我家的佣人先富起来</p>

            <!-- <div class="border-t-2 border-cyan-600"></div> -->
            <div class="w-full border-t-2 border-cyan-600"></div>
            <div class="mt-auto flex justify-end" >
                <p>1楼 2023-11-4 18:23</p>
            </div>

        </div>
    </div>

</template>

<script>
// import showReviewPart from "./Footer.vue"

import { testGetAPI } from '../utils/request';
export default {
  name: 'FullPoster',
//   mounted() {
//     showReviewPart = true;
//   },
}
</script>