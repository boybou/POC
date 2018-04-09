import axios from 'axios';


export const FETCH_ARTIKELS = 'FETCH_ARTIKELS';

export function fetchArtikels(){
    const url = `/user/artikels`;
    const request = axios.get(url);

    return{
        type: FETCH_ARTIKELS,
        payload: request
    }
}