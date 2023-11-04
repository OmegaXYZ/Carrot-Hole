import axios from 'axios';

const postPublishUrl = 'http://localhost:8080/post/publish';
const headers = {
    "Content-Type": "application/json",
  };


export function postPublishAPI(postTitle,postContent,userId) {
    return axios.post(
        postPublishUrl,
      {
        postTitle: postTitle,
        postContent:postContent,
        userId:userId,
      },
      { headers }
    );
  }


export default {postPublishAPI};
