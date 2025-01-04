/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1/query_profile.proto

// Protobuf Java Version: 3.25.5
package com.google.datastore.v1;

public interface ExecutionStatsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.datastore.v1.ExecutionStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Total number of results returned, including documents, projections,
   * aggregation results, keys.
   * </pre>
   *
   * <code>int64 results_returned = 1;</code>
   *
   * @return The resultsReturned.
   */
  long getResultsReturned();

  /**
   *
   *
   * <pre>
   * Total time to execute the query in the backend.
   * </pre>
   *
   * <code>.google.protobuf.Duration execution_duration = 3;</code>
   *
   * @return Whether the executionDuration field is set.
   */
  boolean hasExecutionDuration();
  /**
   *
   *
   * <pre>
   * Total time to execute the query in the backend.
   * </pre>
   *
   * <code>.google.protobuf.Duration execution_duration = 3;</code>
   *
   * @return The executionDuration.
   */
  com.google.protobuf.Duration getExecutionDuration();
  /**
   *
   *
   * <pre>
   * Total time to execute the query in the backend.
   * </pre>
   *
   * <code>.google.protobuf.Duration execution_duration = 3;</code>
   */
  com.google.protobuf.DurationOrBuilder getExecutionDurationOrBuilder();

  /**
   *
   *
   * <pre>
   * Total billable read operations.
   * </pre>
   *
   * <code>int64 read_operations = 4;</code>
   *
   * @return The readOperations.
   */
  long getReadOperations();

  /**
   *
   *
   * <pre>
   * Debugging statistics from the execution of the query. Note that the
   * debugging stats are subject to change as Firestore evolves. It could
   * include:
   *  {
   *    "indexes_entries_scanned": "1000",
   *    "documents_scanned": "20",
   *    "billing_details" : {
   *       "documents_billable": "20",
   *       "index_entries_billable": "1000",
   *       "min_query_cost": "0"
   *    }
   *  }
   * </pre>
   *
   * <code>.google.protobuf.Struct debug_stats = 5;</code>
   *
   * @return Whether the debugStats field is set.
   */
  boolean hasDebugStats();
  /**
   *
   *
   * <pre>
   * Debugging statistics from the execution of the query. Note that the
   * debugging stats are subject to change as Firestore evolves. It could
   * include:
   *  {
   *    "indexes_entries_scanned": "1000",
   *    "documents_scanned": "20",
   *    "billing_details" : {
   *       "documents_billable": "20",
   *       "index_entries_billable": "1000",
   *       "min_query_cost": "0"
   *    }
   *  }
   * </pre>
   *
   * <code>.google.protobuf.Struct debug_stats = 5;</code>
   *
   * @return The debugStats.
   */
  com.google.protobuf.Struct getDebugStats();
  /**
   *
   *
   * <pre>
   * Debugging statistics from the execution of the query. Note that the
   * debugging stats are subject to change as Firestore evolves. It could
   * include:
   *  {
   *    "indexes_entries_scanned": "1000",
   *    "documents_scanned": "20",
   *    "billing_details" : {
   *       "documents_billable": "20",
   *       "index_entries_billable": "1000",
   *       "min_query_cost": "0"
   *    }
   *  }
   * </pre>
   *
   * <code>.google.protobuf.Struct debug_stats = 5;</code>
   */
  com.google.protobuf.StructOrBuilder getDebugStatsOrBuilder();
}
