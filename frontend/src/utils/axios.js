import axios from 'axios';

export function MyAxios(axiosConfig){
    const service = axios.create({
        baseURL:'http://localhost:8080',
        timeout:10000,
    });

    return service(axiosConfig)
}

