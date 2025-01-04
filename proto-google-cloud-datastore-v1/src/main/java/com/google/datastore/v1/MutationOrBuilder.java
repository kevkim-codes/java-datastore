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

public interface MutationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.datastore.v1.Mutation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The entity to insert. The entity must not already exist.
   * The entity key's final path element may be incomplete.
   * </pre>
   *
   * <code>.google.datastore.v1.Entity insert = 4;</code>
   *
   * @return Whether the insert field is set.
   */
  boolean hasInsert();
  /**
   *
   *
   * <pre>
   * The entity to insert. The entity must not already exist.
   * The entity key's final path element may be incomplete.
   * </pre>
   *
   * <code>.google.datastore.v1.Entity insert = 4;</code>
   *
   * @return The insert.
   */
  com.google.datastore.v1.Entity getInsert();
  /**
   *
   *
   * <pre>
   * The entity to insert. The entity must not already exist.
   * The entity key's final path element may be incomplete.
   * </pre>
   *
   * <code>.google.datastore.v1.Entity insert = 4;</code>
   */
  com.google.datastore.v1.EntityOrBuilder getInsertOrBuilder();

  /**
   *
   *
   * <pre>
   * The entity to update. The entity must already exist.
   * Must have a complete key path.
   * </pre>
   *
   * <code>.google.datastore.v1.Entity update = 5;</code>
   *
   * @return Whether the update field is set.
   */
  boolean hasUpdate();
  /**
   *
   *
   * <pre>
   * The entity to update. The entity must already exist.
   * Must have a complete key path.
   * </pre>
   *
   * <code>.google.datastore.v1.Entity update = 5;</code>
   *
   * @return The update.
   */
  com.google.datastore.v1.Entity getUpdate();
  /**
   *
   *
   * <pre>
   * The entity to update. The entity must already exist.
   * Must have a complete key path.
   * </pre>
   *
   * <code>.google.datastore.v1.Entity update = 5;</code>
   */
  com.google.datastore.v1.EntityOrBuilder getUpdateOrBuilder();

  /**
   *
   *
   * <pre>
   * The entity to upsert. The entity may or may not already exist.
   * The entity key's final path element may be incomplete.
   * </pre>
   *
   * <code>.google.datastore.v1.Entity upsert = 6;</code>
   *
   * @return Whether the upsert field is set.
   */
  boolean hasUpsert();
  /**
   *
   *
   * <pre>
   * The entity to upsert. The entity may or may not already exist.
   * The entity key's final path element may be incomplete.
   * </pre>
   *
   * <code>.google.datastore.v1.Entity upsert = 6;</code>
   *
   * @return The upsert.
   */
  com.google.datastore.v1.Entity getUpsert();
  /**
   *
   *
   * <pre>
   * The entity to upsert. The entity may or may not already exist.
   * The entity key's final path element may be incomplete.
   * </pre>
   *
   * <code>.google.datastore.v1.Entity upsert = 6;</code>
   */
  com.google.datastore.v1.EntityOrBuilder getUpsertOrBuilder();

  /**
   *
   *
   * <pre>
   * The key of the entity to delete. The entity may or may not already exist.
   * Must have a complete key path and must not be reserved/read-only.
   * </pre>
   *
   * <code>.google.datastore.v1.Key delete = 7;</code>
   *
   * @return Whether the delete field is set.
   */
  boolean hasDelete();
  /**
   *
   *
   * <pre>
   * The key of the entity to delete. The entity may or may not already exist.
   * Must have a complete key path and must not be reserved/read-only.
   * </pre>
   *
   * <code>.google.datastore.v1.Key delete = 7;</code>
   *
   * @return The delete.
   */
  com.google.datastore.v1.Key getDelete();
  /**
   *
   *
   * <pre>
   * The key of the entity to delete. The entity may or may not already exist.
   * Must have a complete key path and must not be reserved/read-only.
   * </pre>
   *
   * <code>.google.datastore.v1.Key delete = 7;</code>
   */
  com.google.datastore.v1.KeyOrBuilder getDeleteOrBuilder();

  /**
   *
   *
   * <pre>
   * The version of the entity that this mutation is being applied
   * to. If this does not match the current version on the server, the
   * mutation conflicts.
   * </pre>
   *
   * <code>int64 base_version = 8;</code>
   *
   * @return Whether the baseVersion field is set.
   */
  boolean hasBaseVersion();
  /**
   *
   *
   * <pre>
   * The version of the entity that this mutation is being applied
   * to. If this does not match the current version on the server, the
   * mutation conflicts.
   * </pre>
   *
   * <code>int64 base_version = 8;</code>
   *
   * @return The baseVersion.
   */
  long getBaseVersion();

  /**
   *
   *
   * <pre>
   * The update time of the entity that this mutation is being applied
   * to. If this does not match the current update time on the server, the
   * mutation conflicts.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * The update time of the entity that this mutation is being applied
   * to. If this does not match the current update time on the server, the
   * mutation conflicts.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * The update time of the entity that this mutation is being applied
   * to. If this does not match the current update time on the server, the
   * mutation conflicts.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The strategy to use when a conflict is detected. Defaults to
   * `SERVER_VALUE`.
   * If this is set, then `conflict_detection_strategy` must also be set.
   * </pre>
   *
   * <code>
   * .google.datastore.v1.Mutation.ConflictResolutionStrategy conflict_resolution_strategy = 10;
   * </code>
   *
   * @return The enum numeric value on the wire for conflictResolutionStrategy.
   */
  int getConflictResolutionStrategyValue();
  /**
   *
   *
   * <pre>
   * The strategy to use when a conflict is detected. Defaults to
   * `SERVER_VALUE`.
   * If this is set, then `conflict_detection_strategy` must also be set.
   * </pre>
   *
   * <code>
   * .google.datastore.v1.Mutation.ConflictResolutionStrategy conflict_resolution_strategy = 10;
   * </code>
   *
   * @return The conflictResolutionStrategy.
   */
  com.google.datastore.v1.Mutation.ConflictResolutionStrategy getConflictResolutionStrategy();

  /**
   *
   *
   * <pre>
   * The properties to write in this mutation.
   * None of the properties in the mask may have a reserved name, except for
   * `__key__`.
   * This field is ignored for `delete`.
   *
   * If the entity already exists, only properties referenced in the mask are
   * updated, others are left untouched.
   * Properties referenced in the mask but not in the entity are deleted.
   * </pre>
   *
   * <code>.google.datastore.v1.PropertyMask property_mask = 9;</code>
   *
   * @return Whether the propertyMask field is set.
   */
  boolean hasPropertyMask();
  /**
   *
   *
   * <pre>
   * The properties to write in this mutation.
   * None of the properties in the mask may have a reserved name, except for
   * `__key__`.
   * This field is ignored for `delete`.
   *
   * If the entity already exists, only properties referenced in the mask are
   * updated, others are left untouched.
   * Properties referenced in the mask but not in the entity are deleted.
   * </pre>
   *
   * <code>.google.datastore.v1.PropertyMask property_mask = 9;</code>
   *
   * @return The propertyMask.
   */
  com.google.datastore.v1.PropertyMask getPropertyMask();
  /**
   *
   *
   * <pre>
   * The properties to write in this mutation.
   * None of the properties in the mask may have a reserved name, except for
   * `__key__`.
   * This field is ignored for `delete`.
   *
   * If the entity already exists, only properties referenced in the mask are
   * updated, others are left untouched.
   * Properties referenced in the mask but not in the entity are deleted.
   * </pre>
   *
   * <code>.google.datastore.v1.PropertyMask property_mask = 9;</code>
   */
  com.google.datastore.v1.PropertyMaskOrBuilder getPropertyMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The transforms to perform on the entity.
   *
   * This field can be set only when the operation is `insert`, `update`,
   * or `upsert`. If present, the transforms are be applied to the entity
   * regardless of the property mask, in order, after the operation.
   * </pre>
   *
   * <code>
   * repeated .google.datastore.v1.PropertyTransform property_transforms = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.datastore.v1.PropertyTransform> getPropertyTransformsList();
  /**
   *
   *
   * <pre>
   * Optional. The transforms to perform on the entity.
   *
   * This field can be set only when the operation is `insert`, `update`,
   * or `upsert`. If present, the transforms are be applied to the entity
   * regardless of the property mask, in order, after the operation.
   * </pre>
   *
   * <code>
   * repeated .google.datastore.v1.PropertyTransform property_transforms = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.datastore.v1.PropertyTransform getPropertyTransforms(int index);
  /**
   *
   *
   * <pre>
   * Optional. The transforms to perform on the entity.
   *
   * This field can be set only when the operation is `insert`, `update`,
   * or `upsert`. If present, the transforms are be applied to the entity
   * regardless of the property mask, in order, after the operation.
   * </pre>
   *
   * <code>
   * repeated .google.datastore.v1.PropertyTransform property_transforms = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getPropertyTransformsCount();
  /**
   *
   *
   * <pre>
   * Optional. The transforms to perform on the entity.
   *
   * This field can be set only when the operation is `insert`, `update`,
   * or `upsert`. If present, the transforms are be applied to the entity
   * regardless of the property mask, in order, after the operation.
   * </pre>
   *
   * <code>
   * repeated .google.datastore.v1.PropertyTransform property_transforms = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.datastore.v1.PropertyTransformOrBuilder>
      getPropertyTransformsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. The transforms to perform on the entity.
   *
   * This field can be set only when the operation is `insert`, `update`,
   * or `upsert`. If present, the transforms are be applied to the entity
   * regardless of the property mask, in order, after the operation.
   * </pre>
   *
   * <code>
   * repeated .google.datastore.v1.PropertyTransform property_transforms = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.datastore.v1.PropertyTransformOrBuilder getPropertyTransformsOrBuilder(int index);

  com.google.datastore.v1.Mutation.OperationCase getOperationCase();

  com.google.datastore.v1.Mutation.ConflictDetectionStrategyCase getConflictDetectionStrategyCase();
}
