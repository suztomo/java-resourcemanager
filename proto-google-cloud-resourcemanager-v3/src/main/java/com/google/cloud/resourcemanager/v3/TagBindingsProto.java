/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/resourcemanager/v3/tag_bindings.proto

package com.google.cloud.resourcemanager.v3;

public final class TagBindingsProto {
  private TagBindingsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_TagBinding_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_TagBinding_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_CreateTagBindingMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_CreateTagBindingMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_CreateTagBindingRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_CreateTagBindingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_DeleteTagBindingMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_DeleteTagBindingMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_DeleteTagBindingRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_DeleteTagBindingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_ListTagBindingsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_ListTagBindingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_ListTagBindingsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_ListTagBindingsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/resourcemanager/v3/tag_bi"
          + "ndings.proto\022\037google.cloud.resourcemanag"
          + "er.v3\032\034google/api/annotations.proto\032\027goo"
          + "gle/api/client.proto\032\037google/api/field_b"
          + "ehavior.proto\032\031google/api/resource.proto"
          + "\032#google/longrunning/operations.proto\"\222\001"
          + "\n\nTagBinding\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\016\n\006paren"
          + "t\030\002 \001(\t\022\021\n\ttag_value\030\003 \001(\t:N\352AK\n.cloudre"
          + "sourcemanager.googleapis.com/TagBinding\022"
          + "\031tagBindings/{tag_binding}\"\032\n\030CreateTagB"
          + "indingMetadata\"|\n\027CreateTagBindingReques"
          + "t\022E\n\013tag_binding\030\001 \001(\0132+.google.cloud.re"
          + "sourcemanager.v3.TagBindingB\003\340A\002\022\032\n\rvali"
          + "date_only\030\002 \001(\010B\003\340A\001\"\032\n\030DeleteTagBinding"
          + "Metadata\"_\n\027DeleteTagBindingRequest\022D\n\004n"
          + "ame\030\001 \001(\tB6\340A\002\372A0\n.cloudresourcemanager."
          + "googleapis.com/TagBinding\"d\n\026ListTagBind"
          + "ingsRequest\022\031\n\006parent\030\001 \001(\tB\t\340A\002\372A\003\022\001*\022\026"
          + "\n\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001"
          + "(\tB\003\340A\001\"u\n\027ListTagBindingsResponse\022A\n\014ta"
          + "g_bindings\030\001 \003(\0132+.google.cloud.resource"
          + "manager.v3.TagBinding\022\027\n\017next_page_token"
          + "\030\002 \001(\t2\340\005\n\013TagBindings\022\246\001\n\017ListTagBindin"
          + "gs\0227.google.cloud.resourcemanager.v3.Lis"
          + "tTagBindingsRequest\0328.google.cloud.resou"
          + "rcemanager.v3.ListTagBindingsResponse\" \202"
          + "\323\344\223\002\021\022\017/v3/tagBindings\332A\006parent\022\310\001\n\020Crea"
          + "teTagBinding\0228.google.cloud.resourcemana"
          + "ger.v3.CreateTagBindingRequest\032\035.google."
          + "longrunning.Operation\"[\202\323\344\223\002\036\"\017/v3/tagBi"
          + "ndings:\013tag_binding\332A\013tag_binding\312A&\n\nTa"
          + "gBinding\022\030CreateTagBindingMetadata\022\311\001\n\020D"
          + "eleteTagBinding\0228.google.cloud.resourcem"
          + "anager.v3.DeleteTagBindingRequest\032\035.goog"
          + "le.longrunning.Operation\"\\\202\323\344\223\002\033*\031/v3/{n"
          + "ame=tagBindings/**}\332A\004name\312A1\n\025google.pr"
          + "otobuf.Empty\022\030DeleteTagBindingMetadata\032\220"
          + "\001\312A#cloudresourcemanager.googleapis.com\322"
          + "Aghttps://www.googleapis.com/auth/cloud-"
          + "platform,https://www.googleapis.com/auth"
          + "/cloud-platform.read-onlyB\315\001\n#com.google"
          + ".cloud.resourcemanager.v3B\020TagBindingsPr"
          + "otoP\001ZNgoogle.golang.org/genproto/google"
          + "apis/cloud/resourcemanager/v3;resourcema"
          + "nager\252\002\037Google.Cloud.ResourceManager.V3\312"
          + "\002\037Google\\Cloud\\ResourceManager\\V3b\006proto"
          + "3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
            });
    internal_static_google_cloud_resourcemanager_v3_TagBinding_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_resourcemanager_v3_TagBinding_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_TagBinding_descriptor,
            new java.lang.String[] {
              "Name", "Parent", "TagValue",
            });
    internal_static_google_cloud_resourcemanager_v3_CreateTagBindingMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_resourcemanager_v3_CreateTagBindingMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_CreateTagBindingMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_resourcemanager_v3_CreateTagBindingRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_resourcemanager_v3_CreateTagBindingRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_CreateTagBindingRequest_descriptor,
            new java.lang.String[] {
              "TagBinding", "ValidateOnly",
            });
    internal_static_google_cloud_resourcemanager_v3_DeleteTagBindingMetadata_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_resourcemanager_v3_DeleteTagBindingMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_DeleteTagBindingMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_resourcemanager_v3_DeleteTagBindingRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_resourcemanager_v3_DeleteTagBindingRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_DeleteTagBindingRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_resourcemanager_v3_ListTagBindingsRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_resourcemanager_v3_ListTagBindingsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_ListTagBindingsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_resourcemanager_v3_ListTagBindingsResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_resourcemanager_v3_ListTagBindingsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_ListTagBindingsResponse_descriptor,
            new java.lang.String[] {
              "TagBindings", "NextPageToken",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
