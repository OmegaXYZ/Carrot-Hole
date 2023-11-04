<template>
    <div class="min-h-[10rem] w-full lg:w-5/6 rounded-md border border-sky-400 bg-opacity-25 bg-cyan-40 p-3 m-2 flex">
        <div class="w-1/6 bg-opacity-25 bg-cyan-100 flex flex-col flex-wrap items-center justify-center">
            <ul class="w-20 h-20 bg-cyan-100">
                <img src="../../public/favicon.ico" alt="我是图片" class="w-full h-full object-cover inset-0">
            </ul>
            <ul>{{ jsonData.username }}</ul>
        </div>

        <div class="flex-grow flex flex-wrap p-3 whitespace-pre-line">
            <!-- <p> 大家什么时候举办线下聚会？一群猪他飞上了天 一群海盗淹死在沙滩 我的儿子倍做成了金钱，摇曳的花枯萎在河岸哪。。。允许我家的佣人先富起来</p> -->
            <p> {{ jsonData.content }}</p>
            <!-- <div class="border-t-2 border-cyan-600"></div> -->
            <div class="w-full border-t-2 border-cyan-600"></div>
            <div class="mt-auto flex justify-end" >
                <p>1楼 {{ jsonData.time }}</p>
            </div>

        </div>
    </div>

</template>

<script>

export default {
  name: 'FullPoster',
  data(){
    return{
        jsonData: {
                username: '包包大人',
                content: '我脚踏着大地，我头顶着太阳。我装做这世界唯我独在。我紧闭着双眼，我紧靠着墙；\n 我装做这肩上已没有脑袋。\n 我难以离开，我难以存在，我难以活得过分实实在在！ \n 我想要离开，我想要存在，我想要死去之后从头再来 \n 我想要离开，我想要存在，我想要死去之后从头再来',
                time: '2023-11-04 18:56'
            },
    }
  }
}
</script>