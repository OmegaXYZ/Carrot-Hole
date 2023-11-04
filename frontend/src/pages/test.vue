<template>
    hello
</template>
<script>
    import {helloworld,getPostByIdAPI} from '../utils/request.js';
    helloworld();
    import axios from 'axios';
    // axios.get({
    //     url:'http://localhost:8080/post/get',
    //     params: {  //body参数
    //     id:1
    //     },
    // }).then(res=>{
    //     console.log(res.data);
    // })
    //getPostByIdAPI(1);
</script>