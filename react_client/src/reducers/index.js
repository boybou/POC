import {combineReducers} from 'redux';
import ArtikelsReducer from './reducer_Artikels';

const rootReducer = combineReducers({
    artikels: ArtikelsReducer

});

export default rootReducer;
