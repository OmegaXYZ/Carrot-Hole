import MyAxios from "./axios";

//根据帖子ID获取帖子
export function getPostByIdAPI(postId) {
    const state = 0;
    return MyAxios({
        url:`/post/get`,
        method:'get',
        data:{postId:`${postId}`},
        params:{interfaceState:state}
    }).then(res => {
        console.log(res)
    });
}

//根据帖子ID和回复ID获取回复
export function getChildPostAPI(postId,childId) {
    const state = 1;
    return MyAxios({
        url:`/api/post`,
        method:'post',
        data:{ID:`${postId}`,childID:`${childId}`},
        params:{interfaceState:state}
    }).then(res => {
        console.log(res)
    });
}
// export const getPostByIdAPI = async (postId) => {
//     return MyAxios({
//         url:`/api/post`,
//         method:'post',
//         data:{ID:`${postId}`},
//         params:{interfaceState:state}
//     }).then(res => {
//         console.log(res)
//     });
// };