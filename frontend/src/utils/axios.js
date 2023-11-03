import axios from 'axios';

function MyAxios(axiosConfig){
    const service = axios.create({
        baseURL:'http://1.94.32.182:8080',
        timeout:10000,
    });

    return service(axiosConfig)
}

export default MyAxios;