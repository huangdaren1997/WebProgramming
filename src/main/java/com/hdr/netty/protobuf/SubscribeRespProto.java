// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: main/java/com/hdr/netty/protobuf/SubscribeResp.proto

package com.hdr.netty.protobuf;

public final class SubscribeRespProto {
  private SubscribeRespProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SubscribeRespOrBuilder extends
      // @@protoc_insertion_point(interface_extends:netty.SubscribeResp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 subReqId = 1;</code>
     * @return The subReqId.
     */
    int getSubReqId();

    /**
     * <code>int32 resCode = 2;</code>
     * @return The resCode.
     */
    int getResCode();

    /**
     * <code>string desc = 3;</code>
     * @return The desc.
     */
    java.lang.String getDesc();
    /**
     * <code>string desc = 3;</code>
     * @return The bytes for desc.
     */
    com.google.protobuf.ByteString
        getDescBytes();
  }
  /**
   * Protobuf type {@code netty.SubscribeResp}
   */
  public static final class SubscribeResp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:netty.SubscribeResp)
      SubscribeRespOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SubscribeResp.newBuilder() to construct.
    private SubscribeResp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SubscribeResp() {
      desc_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SubscribeResp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SubscribeResp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              subReqId_ = input.readInt32();
              break;
            }
            case 16: {

              resCode_ = input.readInt32();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              desc_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hdr.netty.protobuf.SubscribeRespProto.internal_static_netty_SubscribeResp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hdr.netty.protobuf.SubscribeRespProto.internal_static_netty_SubscribeResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp.class, com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp.Builder.class);
    }

    public static final int SUBREQID_FIELD_NUMBER = 1;
    private int subReqId_;
    /**
     * <code>int32 subReqId = 1;</code>
     * @return The subReqId.
     */
    @java.lang.Override
    public int getSubReqId() {
      return subReqId_;
    }

    public static final int RESCODE_FIELD_NUMBER = 2;
    private int resCode_;
    /**
     * <code>int32 resCode = 2;</code>
     * @return The resCode.
     */
    @java.lang.Override
    public int getResCode() {
      return resCode_;
    }

    public static final int DESC_FIELD_NUMBER = 3;
    private volatile java.lang.Object desc_;
    /**
     * <code>string desc = 3;</code>
     * @return The desc.
     */
    @java.lang.Override
    public java.lang.String getDesc() {
      java.lang.Object ref = desc_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        desc_ = s;
        return s;
      }
    }
    /**
     * <code>string desc = 3;</code>
     * @return The bytes for desc.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDescBytes() {
      java.lang.Object ref = desc_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        desc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (subReqId_ != 0) {
        output.writeInt32(1, subReqId_);
      }
      if (resCode_ != 0) {
        output.writeInt32(2, resCode_);
      }
      if (!getDescBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, desc_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (subReqId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, subReqId_);
      }
      if (resCode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, resCode_);
      }
      if (!getDescBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, desc_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp)) {
        return super.equals(obj);
      }
      com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp other = (com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp) obj;

      if (getSubReqId()
          != other.getSubReqId()) return false;
      if (getResCode()
          != other.getResCode()) return false;
      if (!getDesc()
          .equals(other.getDesc())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + SUBREQID_FIELD_NUMBER;
      hash = (53 * hash) + getSubReqId();
      hash = (37 * hash) + RESCODE_FIELD_NUMBER;
      hash = (53 * hash) + getResCode();
      hash = (37 * hash) + DESC_FIELD_NUMBER;
      hash = (53 * hash) + getDesc().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code netty.SubscribeResp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:netty.SubscribeResp)
        com.hdr.netty.protobuf.SubscribeRespProto.SubscribeRespOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.hdr.netty.protobuf.SubscribeRespProto.internal_static_netty_SubscribeResp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.hdr.netty.protobuf.SubscribeRespProto.internal_static_netty_SubscribeResp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp.class, com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp.Builder.class);
      }

      // Construct using com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        subReqId_ = 0;

        resCode_ = 0;

        desc_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.hdr.netty.protobuf.SubscribeRespProto.internal_static_netty_SubscribeResp_descriptor;
      }

      @java.lang.Override
      public com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp getDefaultInstanceForType() {
        return com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp.getDefaultInstance();
      }

      @java.lang.Override
      public com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp build() {
        com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp buildPartial() {
        com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp result = new com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp(this);
        result.subReqId_ = subReqId_;
        result.resCode_ = resCode_;
        result.desc_ = desc_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp) {
          return mergeFrom((com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp other) {
        if (other == com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp.getDefaultInstance()) return this;
        if (other.getSubReqId() != 0) {
          setSubReqId(other.getSubReqId());
        }
        if (other.getResCode() != 0) {
          setResCode(other.getResCode());
        }
        if (!other.getDesc().isEmpty()) {
          desc_ = other.desc_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int subReqId_ ;
      /**
       * <code>int32 subReqId = 1;</code>
       * @return The subReqId.
       */
      @java.lang.Override
      public int getSubReqId() {
        return subReqId_;
      }
      /**
       * <code>int32 subReqId = 1;</code>
       * @param value The subReqId to set.
       * @return This builder for chaining.
       */
      public Builder setSubReqId(int value) {
        
        subReqId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 subReqId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSubReqId() {
        
        subReqId_ = 0;
        onChanged();
        return this;
      }

      private int resCode_ ;
      /**
       * <code>int32 resCode = 2;</code>
       * @return The resCode.
       */
      @java.lang.Override
      public int getResCode() {
        return resCode_;
      }
      /**
       * <code>int32 resCode = 2;</code>
       * @param value The resCode to set.
       * @return This builder for chaining.
       */
      public Builder setResCode(int value) {
        
        resCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 resCode = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearResCode() {
        
        resCode_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object desc_ = "";
      /**
       * <code>string desc = 3;</code>
       * @return The desc.
       */
      public java.lang.String getDesc() {
        java.lang.Object ref = desc_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          desc_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string desc = 3;</code>
       * @return The bytes for desc.
       */
      public com.google.protobuf.ByteString
          getDescBytes() {
        java.lang.Object ref = desc_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          desc_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string desc = 3;</code>
       * @param value The desc to set.
       * @return This builder for chaining.
       */
      public Builder setDesc(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        desc_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string desc = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearDesc() {
        
        desc_ = getDefaultInstance().getDesc();
        onChanged();
        return this;
      }
      /**
       * <code>string desc = 3;</code>
       * @param value The bytes for desc to set.
       * @return This builder for chaining.
       */
      public Builder setDescBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        desc_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:netty.SubscribeResp)
    }

    // @@protoc_insertion_point(class_scope:netty.SubscribeResp)
    private static final com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp();
    }

    public static com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SubscribeResp>
        PARSER = new com.google.protobuf.AbstractParser<SubscribeResp>() {
      @java.lang.Override
      public SubscribeResp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SubscribeResp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SubscribeResp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SubscribeResp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.hdr.netty.protobuf.SubscribeRespProto.SubscribeResp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_netty_SubscribeResp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_netty_SubscribeResp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4main/java/com/hdr/netty/protobuf/Subsc" +
      "ribeResp.proto\022\005netty\"@\n\rSubscribeResp\022\020" +
      "\n\010subReqId\030\001 \001(\005\022\017\n\007resCode\030\002 \001(\005\022\014\n\004des" +
      "c\030\003 \001(\tB,\n\026com.hdr.netty.protobufB\022Subsc" +
      "ribeRespProtob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_netty_SubscribeResp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_netty_SubscribeResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_netty_SubscribeResp_descriptor,
        new java.lang.String[] { "SubReqId", "ResCode", "Desc", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}