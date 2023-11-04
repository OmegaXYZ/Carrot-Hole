import axios from "axios";
const getPostByIdAPIUrl = "http://127.0.0.1:8080/post/get";
const getPostListAPIUrl = "http://localhost:8080/post/getPostList";
const baseUrl = "http://127.0.0.1:8080/";
const headers = {
  "Content-Type": "application/json",
};

const data = {
  postId: 1,
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
    return axios.get(
        getPostListAPIUrl,
        { headers }
    )
}
export default {
    getPostByIdAPI,
    getPostListAPI,
};
