// src/CohortDetails.js
import React from 'react';

function CohortDetails(props) {
  const { cohort } = props;

  // Optional: Use "data-status" attribute for CSS styling based on status
  const statusLower = cohort.currentStatus.toLowerCase();

  return (
    <div className="box">
      <h3 data-status={statusLower}>
        {cohort.cohortCode} - <span>{cohort.technology}</span>
      </h3>
      <dl>
        <dt>Started On</dt>
        <dd>{cohort.startDate}</dd>
        <dt>Current Status</dt>
        <dd>{cohort.currentStatus}</dd>
        <dt>Coach</dt>
        <dd>{cohort.coachName}</dd>
        <dt>Trainer</dt>
        <dd>{cohort.trainerName}</dd>
      </dl>
    </div>
  );
}

export default CohortDetails;
