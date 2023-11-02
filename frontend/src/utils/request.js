import axios from 'axios';

const BASE_URL = 'http://1.94.32.182:8000/api';

export const getPostById = async (postId) => {
    try {
        const response = await axios.get(`${BASE_URL}/posts/${postId}`);
        return response.data;
    } catch (error) {
        console.error(error);
    }
};
