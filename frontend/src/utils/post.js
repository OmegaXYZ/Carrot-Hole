import axios from "axios";

const postPublishUrl = "http://localhost:8080/post/publish";
const commentPublishUrl = "http://localhost:8080/comment/publish";

const headers = {
  "Content-Type": "application/json",
};

export function postPublishAPI(postTitle, postContent, userId) {
  return axios.post(
    postPublishUrl,
    {
      postTitle: postTitle,
      postContent: postContent,
      userId: userId,
    },
    { headers }
  );
}

export function commentPublishAPI(postId, userId, commentContent) {
  return axios.post(
    commentPublishUrl,
    {
      postId: postId,
      userId: userId,
      commentContent: commentContent,
    },
    { headers }
  );
}

export default { postPublishAPI, commentPublishAPI };
