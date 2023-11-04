<template>
    hello
</template>
<script>
    import {getPostByIdAPI,getPostListAPI,getPostCommentListAPI} from '../utils/request.js';
    import {postPublishAPI} from '../utils/post.js';
    getPostByIdAPI(0).then(response => {
        console.log('响应数据：', response.data);
    })
    .catch(error => {
        console.error('请求失败：', error);
    });

    getPostListAPI().then(response => {
        console.log('响应数据：', response.data);
    })
    .catch(error => {
        console.error('请求失败：', error);
    });

    getPostCommentListAPI(0).then(response => {
        console.log('响应数据：', response.data);
    })
    .catch(error => {
        console.error('请求失败：', error);
    });

    postPublishAPI(0, "title", "content").then(response => {
        console.log('响应数据：', response.data);
    })
    .catch(error => {
        console.error('请求失败：', error);
    });

</script>