import axios from "axios";
const getPostByIdAPIUrl = "http://127.0.0.1:8080/post/get";
const getPostListAPIUrl = "http://localhost:8080/post/getPostList";
const getPostCommentListAPIUrl =
  "http://localhost:8080/comment/getPostComment";
const headers = {
  "Content-Type": "application/json",
};

export function getPostByIdAPI(postId) {
  return axios.post(
    getPostByIdAPIUrl,
    {
      postId: postId,
    },
    { headers }
  );
}

export function getPostListAPI() {
  return axios.get(getPostListAPIUrl, { headers });
}

export function getPostCommentListAPI(postId) {
  return axios.post(
    getPostCommentListAPIUrl,
    {
      postId: postId,
    },
    { headers }
  );
}
export default {
  getPostByIdAPI,
  getPostListAPI,
  getPostCommentListAPI,
};
