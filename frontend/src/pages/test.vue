<template>
    <p>hello</p>
    <p>{{ test }}</p>
    <div v-if="postData">
        <p>{{ postData.postTitle }}</p>
        <p>{{ postData.postContent }}</p>
    </div>
</template>
<script>
import {
    getPostByIdAPI,
    getPostListAPI,
    getPostCommentListAPI,
} from "../utils/request.js";
import { postPublishAPI, commentPublishAPI } from "../utils/post.js";

export default {
    name: "Test",
    data() {
        return {
            test: "helloTest",
            postData: null,
        };
    },
    created() {
        getPostByIdAPI(0).then(response => {
            //let res = response.data;
            console.log('title:', response.data.post.postTitle);
            console.log('content:', response.data.post.postContent);
            this.postData = response.data.post;
            //let postData = response.data.post;
            //console.log('响应数据：', postData);
        })
            .catch(error => {
                console.error('请求失败：', error);
            });
    }
};



//const res = getPostByIdAPI(0).then();
//console.log(res);

// getPostListAPI().then(response => {
//     console.log('响应数据：', response.data);
//     console.log('第一个的title:', response.data[0].title);
// })
// .catch(error => {
//     console.error('请求失败：', error);
// });


// getPostCommentListAPI(0).then(response => {
//     console.log('响应数据：', response.data);
// })
// .catch(error => {
//     console.error('请求失败：', error);
// });

// postPublishAPI(0, "title", "content")
//   .then((response) => {
//     console.log("响应数据：", response.data);
//   })
//   .catch((error) => {
//     console.error("请求失败：", error);
//   });

// commentPublishAPI(0, 0, "commentTest1")
//   .then((response) => {
//     console.log("响应数据：", response.data);
//   })
//   .catch((error) => {
//     console.error("请求失败：", error);
//   });
</script>
