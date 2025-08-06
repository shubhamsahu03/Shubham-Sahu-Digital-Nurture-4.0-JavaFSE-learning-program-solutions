import React, { Component } from 'react';
import './CalculateScore.css';

class CalculateScore extends Component {
  constructor(props) {
    super(props);
    this.state = {
      score1: '',
      score2: '',
      score3: '',
      total: 0
    };
  }

  handleChange = (e) => {
    this.setState({ [e.target.name]: e.target.value });
  }

  calculateTotal = () => {
    const { score1, score2, score3 } = this.state;
    const num1 = parseInt(score1) || 0;
    const num2 = parseInt(score2) || 0;
    const num3 = parseInt(score3) || 0;
    this.setState({ total: num1 + num2 + num3 });
  }

  render() {
    return (
      <div className="score-container">
        <h2>Score Calculator</h2>
        <label>
          Score 1:
          <input
            type="number"
            name="score1"
            value={this.state.score1}
            onChange={this.handleChange}
            className="score-input"
          />
        </label>
        <br />
        <label>
          Score 2:
          <input
            type="number"
            name="score2"
            value={this.state.score2}
            onChange={this.handleChange}
            className="score-input"
          />
        </label>
        <br />
        <label>
          Score 3:
          <input
            type="number"
            name="score3"
            value={this.state.score3}
            onChange={this.handleChange}
            className="score-input"
          />
        </label>
        <br />
        <button className="score-btn" onClick={this.calculateTotal}>Calculate Total</button>
        <h3>Total Score: <span className="total-value">{this.state.total}</span></h3>
      </div>
    );
  }
}

export default CalculateScore;
