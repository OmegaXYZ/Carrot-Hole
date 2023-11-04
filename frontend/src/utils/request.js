import myAxios from "./axios";

//根据帖子ID获取帖子
export function getPostByIdAPI(postId) {
    return myAxios({
        url:`/post/get`,
        method:'get',
        data:{postId:1},
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
export function testGetAPI(){
    console.log("testGetAPI")
    return 1;
}
export function helloworld(){
    console.log("helloworld")
    return 1;
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
