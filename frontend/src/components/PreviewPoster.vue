<template>
    <div class="h-35 w-full lg:w-4/5 rounded-md border border-sky-400 bg-opacity-25 bg-cyan-40 p-3 m-2">
        <div class="rounded-md h-1/4 w-full bg-opacity-25 mb-5">
            <p class="text-3xl font-semibold">
                <router-link to="/Post">
                    前往对应帖子详情页面
                </router-link>
            </p>
        </div>
        <div class="border-t-2 border-cyan-600 my-1"></div>
            <div class="rounded-md h-1/2 w-full bg-opacity-25 p-1">
                <p class="text-md">
                    <strong class="font-bold">{{user}}:  </strong>
                    {{ postText }}
                </p>
            </div>
    </div>
</template>

<script>

export default {
  name: 'PreviewPoster',
  data(){
    return{
        user:"昨夜朱楼梦  ",
        postText:"  光与影的对白qwertyyipasdfggjklzcxbnm\nsadsaasdsadadsdas之前有虐鼠老哥做过实验，给仓鼠大爷喝了换算到人类的体重，大概相当于20多瓶茅台的巨量白酒。结果鼠大爷睡了一觉就又活蹦乱跳了。",
    }
  }

}
</script>