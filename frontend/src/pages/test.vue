<template>
    hello
</template>
<script>
    import {helloworld,getPostByIdAPI} from '../utils/request.js';
    helloworld();
    import axios from 'axios';
    const apiUrl = 'http://localhost:8080/post/get';
    const requestBody ={
        postId:1
    };
    axios.post(apiUrl,requestBody).then((res)=>{
        console.log(res);
    }).catch(err=>{
        console.log(err);
    })
    //getPostByIdAPI(1);
</script>