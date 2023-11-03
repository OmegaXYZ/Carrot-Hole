import axios from 'axios';

const BASE_URL = 'http://1.94.32.182:8000/api';

const uploadPost = async (userId, timeData, content) => {
    try {
        const response = await axios.post(`${BASE_URL}/api/posts`, {
            userId,
            timeData,
            content,
        });
        return response.data;
    } catch (error) {
        console.error(error);
    }
};

export default uploadPost;
