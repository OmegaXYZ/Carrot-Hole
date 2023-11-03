<template>
    <div class="h-40 w-full lg:w-4/5 rounded-md border border-sky-400 bg-opacity-25 bg-cyan-40 p-3"> 
    <div class="rounded-md h-1/2 w-full bg-opacity-25">
        <p class="text-3xl font-semibold"><router-link to="/dashboard">前往关于页面</router-link></p>
    </div>
    <div class="border-t-2 border-cyan-600 my-1"></div>
    <div class="rounded-md h-1/2 w-full bg-opacity-25 p-1">
        <p class="text-2xl">昨夜朱楼梦</p>
        <p class="text-md">光与影的对白</p>
    </div>
    </div>

</template>

<script>
// import { mapState } from 'vuex'
// import 

export default {
  name: 'PreviewPoster',
}
</script>