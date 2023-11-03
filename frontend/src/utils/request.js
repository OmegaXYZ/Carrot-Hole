import MyAxios from "./axios";

export const getPostByIdAPI = async (postId) => {
    return MyAxios({
        url:`/api/post`,
        method:'post',
        data:{ID:`${postId}`},
        params:{interfaceState:state}
    }).then(res => {
        console.log(res)
    });
};

export default getPostByIdAPI;