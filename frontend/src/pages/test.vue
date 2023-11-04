<template>
    hello
</template>
<script>
    import {helloworld,getPostByIdAPI} from '../utils/request.js';
    helloworld();

    import axios from 'axios';

    const apiUrl = 'http://127.0.0.1:8080/post/get';

    const headers = {
    'Content-Type': 'application/json',

    };

    const data = {
    postId: 1,
    };

    axios.post(apiUrl, data, { headers })
    .then(response => {
        console.log('响应数据：', response.data);
    })
    .catch(error => {
        console.error('请求失败：', error);
    });
        //getPostByIdAPI(1);
</script>