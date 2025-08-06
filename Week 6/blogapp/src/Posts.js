// src/Posts.js
import React, { Component } from 'react';

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [], // array of post objects
      hasError: false,
      errorMessage: ''
    };
  }

  // Method to fetch posts data and assign it to state
  loadPosts = () => {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(response => {
        if (!response.ok) {
          throw new Error(`HTTP error! status: ${response.status}`);
        }
        return response.json();
      })
      .then(data => {
        this.setState({ posts: data });
      })
      .catch(error => {
        this.setState({ hasError: true, errorMessage: error.message });
      });
  }

  // Lifecycle method to trigger data fetch after component mounts
  componentDidMount() {
    this.loadPosts();
  }

  // Error boundary method to catch rendering errors in this component or its children
  componentDidCatch(error, info) {
    alert('An error occurred in Posts component: ' + error.toString());
    // Optionally, could update state or log error here
  }

  render() {
    const { posts, hasError, errorMessage } = this.state;

    if (hasError) {
      return <div style={{ color: 'red' }}>Error: {errorMessage}</div>;
    }

    return (
      <div style={{ padding: '20px' }}>
        <h2>Blog Posts</h2>
        {posts.length === 0 ? (
          <p>Loading posts...</p>
        ) : (
          posts.map(post => (
            <div key={post.id} style={{ marginBottom: '20px', borderBottom: '1px solid #ccc', paddingBottom: '10px' }}>
              <h3>{post.title}</h3>
              <p>{post.body}</p>
            </div>
          ))
        )}
      </div>
    );
  }
}

export default Posts;
