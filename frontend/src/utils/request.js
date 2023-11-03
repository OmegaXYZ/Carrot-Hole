import MyAxios from "./axios";

export const getPostByIdAPI = async (postId) => {
    return MyAxios({
        url:`/api/post/${postId}`,
        method:'get',
    });
};

export default getPostByIdAPI;