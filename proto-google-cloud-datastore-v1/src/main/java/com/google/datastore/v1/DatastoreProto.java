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
// source: google/datastore/v1/datastore.proto

// Protobuf Java Version: 3.25.5
package com.google.datastore.v1;

public final class DatastoreProto {
  private DatastoreProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_datastore_v1_LookupRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_LookupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_datastore_v1_LookupResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_LookupResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_datastore_v1_RunQueryRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_RunQueryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_datastore_v1_RunQueryResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_RunQueryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_datastore_v1_RunAggregationQueryRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_RunAggregationQueryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_datastore_v1_RunAggregationQueryResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_RunAggregationQueryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_datastore_v1_BeginTransactionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_BeginTransactionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_datastore_v1_BeginTransactionResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_BeginTransactionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_datastore_v1_RollbackRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_RollbackRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_datastore_v1_RollbackResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_RollbackResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_datastore_v1_CommitRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_CommitRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_datastore_v1_CommitResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_CommitResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_datastore_v1_AllocateIdsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_AllocateIdsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_datastore_v1_AllocateIdsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_AllocateIdsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_datastore_v1_ReserveIdsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_ReserveIdsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_datastore_v1_ReserveIdsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_ReserveIdsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_datastore_v1_Mutation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_Mutation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_datastore_v1_PropertyTransform_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_PropertyTransform_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_datastore_v1_MutationResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_MutationResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_datastore_v1_PropertyMask_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_PropertyMask_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_datastore_v1_ReadOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_ReadOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_datastore_v1_TransactionOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_TransactionOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_datastore_v1_TransactionOptions_ReadWrite_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_TransactionOptions_ReadWrite_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_datastore_v1_TransactionOptions_ReadOnly_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_TransactionOptions_ReadOnly_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n#google/datastore/v1/datastore.proto\022\023g"
          + "oogle.datastore.v1\032\034google/api/annotatio"
          + "ns.proto\032\027google/api/client.proto\032\037googl"
          + "e/api/field_behavior.proto\032\030google/api/r"
          + "outing.proto\032,google/datastore/v1/aggreg"
          + "ation_result.proto\032 google/datastore/v1/"
          + "entity.proto\032\037google/datastore/v1/query."
          + "proto\032\'google/datastore/v1/query_profile"
          + ".proto\032\037google/protobuf/timestamp.proto\""
          + "\334\001\n\rLookupRequest\022\027\n\nproject_id\030\010 \001(\tB\003\340"
          + "A\002\022\023\n\013database_id\030\t \001(\t\0226\n\014read_options\030"
          + "\001 \001(\0132 .google.datastore.v1.ReadOptions\022"
          + "+\n\004keys\030\003 \003(\0132\030.google.datastore.v1.KeyB"
          + "\003\340A\002\0228\n\rproperty_mask\030\005 \001(\0132!.google.dat"
          + "astore.v1.PropertyMask\"\346\001\n\016LookupRespons"
          + "e\0220\n\005found\030\001 \003(\0132!.google.datastore.v1.E"
          + "ntityResult\0222\n\007missing\030\002 \003(\0132!.google.da"
          + "tastore.v1.EntityResult\022*\n\010deferred\030\003 \003("
          + "\0132\030.google.datastore.v1.Key\022\023\n\013transacti"
          + "on\030\005 \001(\014\022-\n\tread_time\030\007 \001(\0132\032.google.pro"
          + "tobuf.Timestamp\"\233\003\n\017RunQueryRequest\022\027\n\np"
          + "roject_id\030\010 \001(\tB\003\340A\002\022\023\n\013database_id\030\t \001("
          + "\t\0226\n\014partition_id\030\002 \001(\0132 .google.datasto"
          + "re.v1.PartitionId\0226\n\014read_options\030\001 \001(\0132"
          + " .google.datastore.v1.ReadOptions\022+\n\005que"
          + "ry\030\003 \001(\0132\032.google.datastore.v1.QueryH\000\0222"
          + "\n\tgql_query\030\007 \001(\0132\035.google.datastore.v1."
          + "GqlQueryH\000\0228\n\rproperty_mask\030\n \001(\0132!.goog"
          + "le.datastore.v1.PropertyMask\022A\n\017explain_"
          + "options\030\014 \001(\0132#.google.datastore.v1.Expl"
          + "ainOptionsB\003\340A\001B\014\n\nquery_type\"\306\001\n\020RunQue"
          + "ryResponse\0224\n\005batch\030\001 \001(\0132%.google.datas"
          + "tore.v1.QueryResultBatch\022)\n\005query\030\002 \001(\0132"
          + "\032.google.datastore.v1.Query\022\023\n\013transacti"
          + "on\030\005 \001(\014\022<\n\017explain_metrics\030\t \001(\0132#.goog"
          + "le.datastore.v1.ExplainMetrics\"\203\003\n\032RunAg"
          + "gregationQueryRequest\022\027\n\nproject_id\030\010 \001("
          + "\tB\003\340A\002\022\023\n\013database_id\030\t \001(\t\0226\n\014partition"
          + "_id\030\002 \001(\0132 .google.datastore.v1.Partitio"
          + "nId\0226\n\014read_options\030\001 \001(\0132 .google.datas"
          + "tore.v1.ReadOptions\022B\n\021aggregation_query"
          + "\030\003 \001(\0132%.google.datastore.v1.Aggregation"
          + "QueryH\000\0222\n\tgql_query\030\007 \001(\0132\035.google.data"
          + "store.v1.GqlQueryH\000\022A\n\017explain_options\030\013"
          + " \001(\0132#.google.datastore.v1.ExplainOption"
          + "sB\003\340A\001B\014\n\nquery_type\"\342\001\n\033RunAggregationQ"
          + "ueryResponse\022:\n\005batch\030\001 \001(\0132+.google.dat"
          + "astore.v1.AggregationResultBatch\0224\n\005quer"
          + "y\030\002 \001(\0132%.google.datastore.v1.Aggregatio"
          + "nQuery\022\023\n\013transaction\030\005 \001(\014\022<\n\017explain_m"
          + "etrics\030\t \001(\0132#.google.datastore.v1.Expla"
          + "inMetrics\"\215\001\n\027BeginTransactionRequest\022\027\n"
          + "\nproject_id\030\010 \001(\tB\003\340A\002\022\023\n\013database_id\030\t "
          + "\001(\t\022D\n\023transaction_options\030\n \001(\0132\'.googl"
          + "e.datastore.v1.TransactionOptions\"/\n\030Beg"
          + "inTransactionResponse\022\023\n\013transaction\030\001 \001"
          + "(\014\"Y\n\017RollbackRequest\022\027\n\nproject_id\030\010 \001("
          + "\tB\003\340A\002\022\023\n\013database_id\030\t \001(\t\022\030\n\013transacti"
          + "on\030\001 \001(\014B\003\340A\002\"\022\n\020RollbackResponse\"\350\002\n\rCo"
          + "mmitRequest\022\027\n\nproject_id\030\010 \001(\tB\003\340A\002\022\023\n\013"
          + "database_id\030\t \001(\t\0225\n\004mode\030\005 \001(\0162\'.google"
          + ".datastore.v1.CommitRequest.Mode\022\025\n\013tran"
          + "saction\030\001 \001(\014H\000\022I\n\026single_use_transactio"
          + "n\030\n \001(\0132\'.google.datastore.v1.Transactio"
          + "nOptionsH\000\0220\n\tmutations\030\006 \003(\0132\035.google.d"
          + "atastore.v1.Mutation\"F\n\004Mode\022\024\n\020MODE_UNS"
          + "PECIFIED\020\000\022\021\n\rTRANSACTIONAL\020\001\022\025\n\021NON_TRA"
          + "NSACTIONAL\020\002B\026\n\024transaction_selector\"\227\001\n"
          + "\016CommitResponse\022=\n\020mutation_results\030\003 \003("
          + "\0132#.google.datastore.v1.MutationResult\022\025"
          + "\n\rindex_updates\030\004 \001(\005\022/\n\013commit_time\030\010 \001"
          + "(\0132\032.google.protobuf.Timestamp\"o\n\022Alloca"
          + "teIdsRequest\022\027\n\nproject_id\030\010 \001(\tB\003\340A\002\022\023\n"
          + "\013database_id\030\t \001(\t\022+\n\004keys\030\001 \003(\0132\030.googl"
          + "e.datastore.v1.KeyB\003\340A\002\"=\n\023AllocateIdsRe"
          + "sponse\022&\n\004keys\030\001 \003(\0132\030.google.datastore."
          + "v1.Key\"n\n\021ReserveIdsRequest\022\027\n\nproject_i"
          + "d\030\010 \001(\tB\003\340A\002\022\023\n\013database_id\030\t \001(\t\022+\n\004key"
          + "s\030\001 \003(\0132\030.google.datastore.v1.KeyB\003\340A\002\"\024"
          + "\n\022ReserveIdsResponse\"\362\004\n\010Mutation\022-\n\006ins"
          + "ert\030\004 \001(\0132\033.google.datastore.v1.EntityH\000"
          + "\022-\n\006update\030\005 \001(\0132\033.google.datastore.v1.E"
          + "ntityH\000\022-\n\006upsert\030\006 \001(\0132\033.google.datasto"
          + "re.v1.EntityH\000\022*\n\006delete\030\007 \001(\0132\030.google."
          + "datastore.v1.KeyH\000\022\026\n\014base_version\030\010 \001(\003"
          + "H\001\0221\n\013update_time\030\013 \001(\0132\032.google.protobu"
          + "f.TimestampH\001\022^\n\034conflict_resolution_str"
          + "ategy\030\n \001(\01628.google.datastore.v1.Mutati"
          + "on.ConflictResolutionStrategy\0228\n\rpropert"
          + "y_mask\030\t \001(\0132!.google.datastore.v1.Prope"
          + "rtyMask\022H\n\023property_transforms\030\014 \003(\0132&.g"
          + "oogle.datastore.v1.PropertyTransformB\003\340A"
          + "\001\"R\n\032ConflictResolutionStrategy\022\030\n\024STRAT"
          + "EGY_UNSPECIFIED\020\000\022\020\n\014SERVER_VALUE\020\001\022\010\n\004F"
          + "AIL\020\003B\013\n\toperationB\035\n\033conflict_detection"
          + "_strategy\"\343\003\n\021PropertyTransform\022\025\n\010prope"
          + "rty\030\001 \001(\tB\003\340A\001\022Q\n\023set_to_server_value\030\002 "
          + "\001(\01622.google.datastore.v1.PropertyTransf"
          + "orm.ServerValueH\000\022/\n\tincrement\030\003 \001(\0132\032.g"
          + "oogle.datastore.v1.ValueH\000\022-\n\007maximum\030\004 "
          + "\001(\0132\032.google.datastore.v1.ValueH\000\022-\n\007min"
          + "imum\030\005 \001(\0132\032.google.datastore.v1.ValueH\000"
          + "\022B\n\027append_missing_elements\030\006 \001(\0132\037.goog"
          + "le.datastore.v1.ArrayValueH\000\022@\n\025remove_a"
          + "ll_from_array\030\007 \001(\0132\037.google.datastore.v"
          + "1.ArrayValueH\000\"=\n\013ServerValue\022\034\n\030SERVER_"
          + "VALUE_UNSPECIFIED\020\000\022\020\n\014REQUEST_TIME\020\001B\020\n"
          + "\016transform_type\"\374\001\n\016MutationResult\022%\n\003ke"
          + "y\030\003 \001(\0132\030.google.datastore.v1.Key\022\017\n\007ver"
          + "sion\030\004 \001(\003\022/\n\013create_time\030\007 \001(\0132\032.google"
          + ".protobuf.Timestamp\022/\n\013update_time\030\006 \001(\013"
          + "2\032.google.protobuf.Timestamp\022\031\n\021conflict"
          + "_detected\030\005 \001(\010\0225\n\021transform_results\030\010 \003"
          + "(\0132\032.google.datastore.v1.Value\"\035\n\014Proper"
          + "tyMask\022\r\n\005paths\030\001 \003(\t\"\312\002\n\013ReadOptions\022L\n"
          + "\020read_consistency\030\001 \001(\01620.google.datasto"
          + "re.v1.ReadOptions.ReadConsistencyH\000\022\025\n\013t"
          + "ransaction\030\002 \001(\014H\000\022B\n\017new_transaction\030\003 "
          + "\001(\0132\'.google.datastore.v1.TransactionOpt"
          + "ionsH\000\022/\n\tread_time\030\004 \001(\0132\032.google.proto"
          + "buf.TimestampH\000\"M\n\017ReadConsistency\022 \n\034RE"
          + "AD_CONSISTENCY_UNSPECIFIED\020\000\022\n\n\006STRONG\020\001"
          + "\022\014\n\010EVENTUAL\020\002B\022\n\020consistency_type\"\222\002\n\022T"
          + "ransactionOptions\022G\n\nread_write\030\001 \001(\01321."
          + "google.datastore.v1.TransactionOptions.R"
          + "eadWriteH\000\022E\n\tread_only\030\002 \001(\01320.google.d"
          + "atastore.v1.TransactionOptions.ReadOnlyH"
          + "\000\032)\n\tReadWrite\022\034\n\024previous_transaction\030\001"
          + " \001(\014\0329\n\010ReadOnly\022-\n\tread_time\030\001 \001(\0132\032.go"
          + "ogle.protobuf.TimestampB\006\n\004mode2\341\r\n\tData"
          + "store\022\300\001\n\006Lookup\022\".google.datastore.v1.L"
          + "ookupRequest\032#.google.datastore.v1.Looku"
          + "pResponse\"m\332A\034project_id,read_options,ke"
          + "ys\202\323\344\223\002%\" /v1/projects/{project_id}:look"
          + "up:\001*\212\323\344\223\002\035\022\014\n\nproject_id\022\r\n\013database_id"
          + "\022\251\001\n\010RunQuery\022$.google.datastore.v1.RunQ"
          + "ueryRequest\032%.google.datastore.v1.RunQue"
          + "ryResponse\"P\202\323\344\223\002\'\"\"/v1/projects/{projec"
          + "t_id}:runQuery:\001*\212\323\344\223\002\035\022\014\n\nproject_id\022\r\n"
          + "\013database_id\022\325\001\n\023RunAggregationQuery\022/.g"
          + "oogle.datastore.v1.RunAggregationQueryRe"
          + "quest\0320.google.datastore.v1.RunAggregati"
          + "onQueryResponse\"[\202\323\344\223\0022\"-/v1/projects/{p"
          + "roject_id}:runAggregationQuery:\001*\212\323\344\223\002\035\022"
          + "\014\n\nproject_id\022\r\n\013database_id\022\326\001\n\020BeginTr"
          + "ansaction\022,.google.datastore.v1.BeginTra"
          + "nsactionRequest\032-.google.datastore.v1.Be"
          + "ginTransactionResponse\"e\332A\nproject_id\202\323\344"
          + "\223\002/\"*/v1/projects/{project_id}:beginTran"
          + "saction:\001*\212\323\344\223\002\035\022\014\n\nproject_id\022\r\n\013databa"
          + "se_id\022\346\001\n\006Commit\022\".google.datastore.v1.C"
          + "ommitRequest\032#.google.datastore.v1.Commi"
          + "tResponse\"\222\001\332A%project_id,mode,transacti"
          + "on,mutations\332A\031project_id,mode,mutations"
          + "\202\323\344\223\002%\" /v1/projects/{project_id}:commit"
          + ":\001*\212\323\344\223\002\035\022\014\n\nproject_id\022\r\n\013database_id\022\302"
          + "\001\n\010Rollback\022$.google.datastore.v1.Rollba"
          + "ckRequest\032%.google.datastore.v1.Rollback"
          + "Response\"i\332A\026project_id,transaction\202\323\344\223\002"
          + "\'\"\"/v1/projects/{project_id}:rollback:\001*"
          + "\212\323\344\223\002\035\022\014\n\nproject_id\022\r\n\013database_id\022\307\001\n\013"
          + "AllocateIds\022\'.google.datastore.v1.Alloca"
          + "teIdsRequest\032(.google.datastore.v1.Alloc"
          + "ateIdsResponse\"e\332A\017project_id,keys\202\323\344\223\002*"
          + "\"%/v1/projects/{project_id}:allocateIds:"
          + "\001*\212\323\344\223\002\035\022\014\n\nproject_id\022\r\n\013database_id\022\303\001"
          + "\n\nReserveIds\022&.google.datastore.v1.Reser"
          + "veIdsRequest\032\'.google.datastore.v1.Reser"
          + "veIdsResponse\"d\332A\017project_id,keys\202\323\344\223\002)\""
          + "$/v1/projects/{project_id}:reserveIds:\001*"
          + "\212\323\344\223\002\035\022\014\n\nproject_id\022\r\n\013database_id\032v\312A\030"
          + "datastore.googleapis.com\322AXhttps://www.g"
          + "oogleapis.com/auth/cloud-platform,https:"
          + "//www.googleapis.com/auth/datastoreB\277\001\n\027"
          + "com.google.datastore.v1B\016DatastoreProtoP"
          + "\001Z;cloud.google.com/go/datastore/apiv1/d"
          + "atastorepb;datastorepb\252\002\031Google.Cloud.Da"
          + "tastore.V1\312\002\031Google\\Cloud\\Datastore\\V1\352\002"
          + "\034Google::Cloud::Datastore::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.RoutingProto.getDescriptor(),
              com.google.datastore.v1.AggregationResultProto.getDescriptor(),
              com.google.datastore.v1.EntityProto.getDescriptor(),
              com.google.datastore.v1.QueryProto.getDescriptor(),
              com.google.datastore.v1.QueryProfileProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_datastore_v1_LookupRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_datastore_v1_LookupRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_datastore_v1_LookupRequest_descriptor,
            new java.lang.String[] {
              "ProjectId", "DatabaseId", "ReadOptions", "Keys", "PropertyMask",
            });
    internal_static_google_datastore_v1_LookupResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_datastore_v1_LookupResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_datastore_v1_LookupResponse_descriptor,
            new java.lang.String[] {
              "Found", "Missing", "Deferred", "Transaction", "ReadTime",
            });
    internal_static_google_datastore_v1_RunQueryRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_datastore_v1_RunQueryRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_datastore_v1_RunQueryRequest_descriptor,
            new java.lang.String[] {
              "ProjectId",
              "DatabaseId",
              "PartitionId",
              "ReadOptions",
              "Query",
              "GqlQuery",
              "PropertyMask",
              "ExplainOptions",
              "QueryType",
            });
    internal_static_google_datastore_v1_RunQueryResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_datastore_v1_RunQueryResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_datastore_v1_RunQueryResponse_descriptor,
            new java.lang.String[] {
              "Batch", "Query", "Transaction", "ExplainMetrics",
            });
    internal_static_google_datastore_v1_RunAggregationQueryRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_datastore_v1_RunAggregationQueryRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_datastore_v1_RunAggregationQueryRequest_descriptor,
            new java.lang.String[] {
              "ProjectId",
              "DatabaseId",
              "PartitionId",
              "ReadOptions",
              "AggregationQuery",
              "GqlQuery",
              "ExplainOptions",
              "QueryType",
            });
    internal_static_google_datastore_v1_RunAggregationQueryResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_datastore_v1_RunAggregationQueryResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_datastore_v1_RunAggregationQueryResponse_descriptor,
            new java.lang.String[] {
              "Batch", "Query", "Transaction", "ExplainMetrics",
            });
    internal_static_google_datastore_v1_BeginTransactionRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_datastore_v1_BeginTransactionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_datastore_v1_BeginTransactionRequest_descriptor,
            new java.lang.String[] {
              "ProjectId", "DatabaseId", "TransactionOptions",
            });
    internal_static_google_datastore_v1_BeginTransactionResponse_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_datastore_v1_BeginTransactionResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_datastore_v1_BeginTransactionResponse_descriptor,
            new java.lang.String[] {
              "Transaction",
            });
    internal_static_google_datastore_v1_RollbackRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_datastore_v1_RollbackRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_datastore_v1_RollbackRequest_descriptor,
            new java.lang.String[] {
              "ProjectId", "DatabaseId", "Transaction",
            });
    internal_static_google_datastore_v1_RollbackResponse_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_datastore_v1_RollbackResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_datastore_v1_RollbackResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_datastore_v1_CommitRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_datastore_v1_CommitRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_datastore_v1_CommitRequest_descriptor,
            new java.lang.String[] {
              "ProjectId",
              "DatabaseId",
              "Mode",
              "Transaction",
              "SingleUseTransaction",
              "Mutations",
              "TransactionSelector",
            });
    internal_static_google_datastore_v1_CommitResponse_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_datastore_v1_CommitResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_datastore_v1_CommitResponse_descriptor,
            new java.lang.String[] {
              "MutationResults", "IndexUpdates", "CommitTime",
            });
    internal_static_google_datastore_v1_AllocateIdsRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_datastore_v1_AllocateIdsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_datastore_v1_AllocateIdsRequest_descriptor,
            new java.lang.String[] {
              "ProjectId", "DatabaseId", "Keys",
            });
    internal_static_google_datastore_v1_AllocateIdsResponse_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_datastore_v1_AllocateIdsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_datastore_v1_AllocateIdsResponse_descriptor,
            new java.lang.String[] {
              "Keys",
            });
    internal_static_google_datastore_v1_ReserveIdsRequest_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_datastore_v1_ReserveIdsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_datastore_v1_ReserveIdsRequest_descriptor,
            new java.lang.String[] {
              "ProjectId", "DatabaseId", "Keys",
            });
    internal_static_google_datastore_v1_ReserveIdsResponse_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_datastore_v1_ReserveIdsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_datastore_v1_ReserveIdsResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_datastore_v1_Mutation_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_datastore_v1_Mutation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_datastore_v1_Mutation_descriptor,
            new java.lang.String[] {
              "Insert",
              "Update",
              "Upsert",
              "Delete",
              "BaseVersion",
              "UpdateTime",
              "ConflictResolutionStrategy",
              "PropertyMask",
              "PropertyTransforms",
              "Operation",
              "ConflictDetectionStrategy",
            });
    internal_static_google_datastore_v1_PropertyTransform_descriptor =
        getDescriptor().getMessageTypes().get(17);
    internal_static_google_datastore_v1_PropertyTransform_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_datastore_v1_PropertyTransform_descriptor,
            new java.lang.String[] {
              "Property",
              "SetToServerValue",
              "Increment",
              "Maximum",
              "Minimum",
              "AppendMissingElements",
              "RemoveAllFromArray",
              "TransformType",
            });
    internal_static_google_datastore_v1_MutationResult_descriptor =
        getDescriptor().getMessageTypes().get(18);
    internal_static_google_datastore_v1_MutationResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_datastore_v1_MutationResult_descriptor,
            new java.lang.String[] {
              "Key", "Version", "CreateTime", "UpdateTime", "ConflictDetected", "TransformResults",
            });
    internal_static_google_datastore_v1_PropertyMask_descriptor =
        getDescriptor().getMessageTypes().get(19);
    internal_static_google_datastore_v1_PropertyMask_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_datastore_v1_PropertyMask_descriptor,
            new java.lang.String[] {
              "Paths",
            });
    internal_static_google_datastore_v1_ReadOptions_descriptor =
        getDescriptor().getMessageTypes().get(20);
    internal_static_google_datastore_v1_ReadOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_datastore_v1_ReadOptions_descriptor,
            new java.lang.String[] {
              "ReadConsistency", "Transaction", "NewTransaction", "ReadTime", "ConsistencyType",
            });
    internal_static_google_datastore_v1_TransactionOptions_descriptor =
        getDescriptor().getMessageTypes().get(21);
    internal_static_google_datastore_v1_TransactionOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_datastore_v1_TransactionOptions_descriptor,
            new java.lang.String[] {
              "ReadWrite", "ReadOnly", "Mode",
            });
    internal_static_google_datastore_v1_TransactionOptions_ReadWrite_descriptor =
        internal_static_google_datastore_v1_TransactionOptions_descriptor.getNestedTypes().get(0);
    internal_static_google_datastore_v1_TransactionOptions_ReadWrite_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_datastore_v1_TransactionOptions_ReadWrite_descriptor,
            new java.lang.String[] {
              "PreviousTransaction",
            });
    internal_static_google_datastore_v1_TransactionOptions_ReadOnly_descriptor =
        internal_static_google_datastore_v1_TransactionOptions_descriptor.getNestedTypes().get(1);
    internal_static_google_datastore_v1_TransactionOptions_ReadOnly_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_datastore_v1_TransactionOptions_ReadOnly_descriptor,
            new java.lang.String[] {
              "ReadTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.RoutingProto.routing);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.RoutingProto.getDescriptor();
    com.google.datastore.v1.AggregationResultProto.getDescriptor();
    com.google.datastore.v1.EntityProto.getDescriptor();
    com.google.datastore.v1.QueryProto.getDescriptor();
    com.google.datastore.v1.QueryProfileProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
