import React, { Component } from 'react';
import logo from './logo.svg';
import AanvullijstItemList from './containers/aanvullijst_item_list'
import {connect} from 'react-redux';
import {bindActionCreators} from 'redux';
import {fetchArtikels} from "./actions/index";

class App extends Component {
    constructor(props){
        super(props);
        this.props.fetchArtikels();
    }
  render() {
    return (
      <div className="center">
          <AanvullijstItemList/>
      </div>
    );
  }

}



function mapDispatchToProps(dispatch){
    return bindActionCreators({fetchArtikels}, dispatch);
}

export default connect(null,mapDispatchToProps)(App);
