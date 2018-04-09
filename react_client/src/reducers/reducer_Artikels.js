import {FETCH_ARTIKELS} from "../actions/index";

export default function (state = null, action) {
    switch(action.type){
        case FETCH_ARTIKELS:
            return [action.payload.data];
    }
    return state;
}