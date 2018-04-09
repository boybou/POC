import React, {Component} from 'react';
import {connect} from 'react-redux';

class AanvullijstItemList extends Component{
    constructor(props){
        super(props);
        // props.fetchArtikels();
        this.state = {items: []}
    }

    renderList(){
        return this.props.artikels[0].map(function(artikel) {
            return (
                <li key={artikel.id}>
                    <h3>Artikel: {artikel.artikelNaam}</h3>
                         <h3>kast: {artikel.artikelKast}</h3>
                         <h3>Lade: {artikel.artikelLade}</h3>
                </li>);
        });
    }

    render(){
        if(!this.props.artikels){
            console.log("in ding",this.props.artikels);
            return <div>loading...</div>
        }
        console.log("inandered ding",this.props.artikels)
        return(
            <ul >
                {this.renderList()}
            </ul>
        )
    }

}


function mapStateToProps({artikels}){
    console.log("mapstate",artikels);
    return {artikels}
}

export default connect(mapStateToProps)(AanvullijstItemList);