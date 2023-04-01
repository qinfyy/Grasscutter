// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeLimitedShopInfoRsp.proto

package emu.grasscutter.net.proto;

public final class HomeLimitedShopInfoRspOuterClass {
    private HomeLimitedShopInfoRspOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface HomeLimitedShopInfoRspOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:HomeLimitedShopInfoRsp)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int32 retcode = 6;</code>
         *
         * @return The retcode.
         */
        int getRetcode();

        /**
         * <code>.HomeLimitedShopInfo shop_info = 10;</code>
         *
         * @return Whether the shopInfo field is set.
         */
        boolean hasShopInfo();
        /**
         * <code>.HomeLimitedShopInfo shop_info = 10;</code>
         *
         * @return The shopInfo.
         */
        emu.grasscutter.net.proto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo getShopInfo();
        /** <code>.HomeLimitedShopInfo shop_info = 10;</code> */
        emu.grasscutter.net.proto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfoOrBuilder
                getShopInfoOrBuilder();
    }
    /**
     *
     *
     * <pre>
     * Name: PMAGBEFIIEL
     * CmdId: 4791
     * </pre>
     *
     * Protobuf type {@code HomeLimitedShopInfoRsp}
     */
    public static final class HomeLimitedShopInfoRsp extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:HomeLimitedShopInfoRsp)
            HomeLimitedShopInfoRspOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use HomeLimitedShopInfoRsp.newBuilder() to construct.
        private HomeLimitedShopInfoRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private HomeLimitedShopInfoRsp() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new HomeLimitedShopInfoRsp();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private HomeLimitedShopInfoRsp(
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
                        case 48:
                            {
                                retcode_ = input.readInt32();
                                break;
                            }
                        case 82:
                            {
                                emu.grasscutter.net.proto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo.Builder
                                        subBuilder = null;
                                if (shopInfo_ != null) {
                                    subBuilder = shopInfo_.toBuilder();
                                }
                                shopInfo_ =
                                        input.readMessage(
                                                emu.grasscutter.net.proto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo
                                                        .parser(),
                                                extensionRegistry);
                                if (subBuilder != null) {
                                    subBuilder.mergeFrom(shopInfo_);
                                    shopInfo_ = subBuilder.buildPartial();
                                }

                                break;
                            }
                        default:
                            {
                                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass
                    .internal_static_HomeLimitedShopInfoRsp_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass
                    .internal_static_HomeLimitedShopInfoRsp_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp
                                    .class,
                            emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp
                                    .Builder.class);
        }

        public static final int RETCODE_FIELD_NUMBER = 6;
        private int retcode_;
        /**
         * <code>int32 retcode = 6;</code>
         *
         * @return The retcode.
         */
        @java.lang.Override
        public int getRetcode() {
            return retcode_;
        }

        public static final int SHOP_INFO_FIELD_NUMBER = 10;
        private emu.grasscutter.net.proto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo shopInfo_;
        /**
         * <code>.HomeLimitedShopInfo shop_info = 10;</code>
         *
         * @return Whether the shopInfo field is set.
         */
        @java.lang.Override
        public boolean hasShopInfo() {
            return shopInfo_ != null;
        }
        /**
         * <code>.HomeLimitedShopInfo shop_info = 10;</code>
         *
         * @return The shopInfo.
         */
        @java.lang.Override
        public emu.grasscutter.net.proto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo
                getShopInfo() {
            return shopInfo_ == null
                    ? emu.grasscutter.net.proto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo
                            .getDefaultInstance()
                    : shopInfo_;
        }
        /** <code>.HomeLimitedShopInfo shop_info = 10;</code> */
        @java.lang.Override
        public emu.grasscutter.net.proto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfoOrBuilder
                getShopInfoOrBuilder() {
            return getShopInfo();
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
        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            if (retcode_ != 0) {
                output.writeInt32(6, retcode_);
            }
            if (shopInfo_ != null) {
                output.writeMessage(10, getShopInfo());
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (retcode_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeInt32Size(6, retcode_);
            }
            if (shopInfo_ != null) {
                size += com.google.protobuf.CodedOutputStream.computeMessageSize(10, getShopInfo());
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
            if (!(obj
                    instanceof
                    emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp other =
                    (emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp) obj;

            if (getRetcode() != other.getRetcode()) return false;
            if (hasShopInfo() != other.hasShopInfo()) return false;
            if (hasShopInfo()) {
                if (!getShopInfo().equals(other.getShopInfo())) return false;
            }
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
            hash = (37 * hash) + RETCODE_FIELD_NUMBER;
            hash = (53 * hash) + getRetcode();
            if (hasShopInfo()) {
                hash = (37 * hash) + SHOP_INFO_FIELD_NUMBER;
                hash = (53 * hash) + getShopInfo().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp
                parseFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(
                emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp
                        prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         *
         *
         * <pre>
         * Name: PMAGBEFIIEL
         * CmdId: 4791
         * </pre>
         *
         * Protobuf type {@code HomeLimitedShopInfoRsp}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:HomeLimitedShopInfoRsp)
                emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRspOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass
                        .internal_static_HomeLimitedShopInfoRsp_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass
                        .internal_static_HomeLimitedShopInfoRsp_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp
                                        .class,
                                emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp
                                        .Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                retcode_ = 0;

                if (shopInfoBuilder_ == null) {
                    shopInfo_ = null;
                } else {
                    shopInfo_ = null;
                    shopInfoBuilder_ = null;
                }
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass
                        .internal_static_HomeLimitedShopInfoRsp_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp
                    build() {
                emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp
                    buildPartial() {
                emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp result =
                        new emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp(
                                this);
                result.retcode_ = retcode_;
                if (shopInfoBuilder_ == null) {
                    result.shopInfo_ = shopInfo_;
                } else {
                    result.shopInfo_ = shopInfoBuilder_.build();
                }
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index,
                    java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other
                        instanceof
                        emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp other) {
                if (other
                        == emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp
                                .getDefaultInstance()) return this;
                if (other.getRetcode() != 0) {
                    setRetcode(other.getRetcode());
                }
                if (other.hasShopInfo()) {
                    mergeShopInfo(other.getShopInfo());
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
                emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int retcode_;
            /**
             * <code>int32 retcode = 6;</code>
             *
             * @return The retcode.
             */
            @java.lang.Override
            public int getRetcode() {
                return retcode_;
            }
            /**
             * <code>int32 retcode = 6;</code>
             *
             * @param value The retcode to set.
             * @return This builder for chaining.
             */
            public Builder setRetcode(int value) {

                retcode_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 retcode = 6;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearRetcode() {

                retcode_ = 0;
                onChanged();
                return this;
            }

            private emu.grasscutter.net.proto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo shopInfo_;
            private com.google.protobuf.SingleFieldBuilderV3<
                            emu.grasscutter.net.proto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo,
                            emu.grasscutter.net.proto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo.Builder,
                            emu.grasscutter.net.proto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfoOrBuilder>
                    shopInfoBuilder_;
            /**
             * <code>.HomeLimitedShopInfo shop_info = 10;</code>
             *
             * @return Whether the shopInfo field is set.
             */
            public boolean hasShopInfo() {
                return shopInfoBuilder_ != null || shopInfo_ != null;
            }
            /**
             * <code>.HomeLimitedShopInfo shop_info = 10;</code>
             *
             * @return The shopInfo.
             */
            public emu.grasscutter.net.proto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo
                    getShopInfo() {
                if (shopInfoBuilder_ == null) {
                    return shopInfo_ == null
                            ? emu.grasscutter.net.proto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo
                                    .getDefaultInstance()
                            : shopInfo_;
                } else {
                    return shopInfoBuilder_.getMessage();
                }
            }
            /** <code>.HomeLimitedShopInfo shop_info = 10;</code> */
            public Builder setShopInfo(
                    emu.grasscutter.net.proto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo value) {
                if (shopInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    shopInfo_ = value;
                    onChanged();
                } else {
                    shopInfoBuilder_.setMessage(value);
                }

                return this;
            }
            /** <code>.HomeLimitedShopInfo shop_info = 10;</code> */
            public Builder setShopInfo(
                    emu.grasscutter.net.proto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo.Builder
                            builderForValue) {
                if (shopInfoBuilder_ == null) {
                    shopInfo_ = builderForValue.build();
                    onChanged();
                } else {
                    shopInfoBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }
            /** <code>.HomeLimitedShopInfo shop_info = 10;</code> */
            public Builder mergeShopInfo(
                    emu.grasscutter.net.proto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo value) {
                if (shopInfoBuilder_ == null) {
                    if (shopInfo_ != null) {
                        shopInfo_ =
                                emu.grasscutter.net.proto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo
                                        .newBuilder(shopInfo_)
                                        .mergeFrom(value)
                                        .buildPartial();
                    } else {
                        shopInfo_ = value;
                    }
                    onChanged();
                } else {
                    shopInfoBuilder_.mergeFrom(value);
                }

                return this;
            }
            /** <code>.HomeLimitedShopInfo shop_info = 10;</code> */
            public Builder clearShopInfo() {
                if (shopInfoBuilder_ == null) {
                    shopInfo_ = null;
                    onChanged();
                } else {
                    shopInfo_ = null;
                    shopInfoBuilder_ = null;
                }

                return this;
            }
            /** <code>.HomeLimitedShopInfo shop_info = 10;</code> */
            public emu.grasscutter.net.proto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo.Builder
                    getShopInfoBuilder() {

                onChanged();
                return getShopInfoFieldBuilder().getBuilder();
            }
            /** <code>.HomeLimitedShopInfo shop_info = 10;</code> */
            public emu.grasscutter.net.proto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfoOrBuilder
                    getShopInfoOrBuilder() {
                if (shopInfoBuilder_ != null) {
                    return shopInfoBuilder_.getMessageOrBuilder();
                } else {
                    return shopInfo_ == null
                            ? emu.grasscutter.net.proto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo
                                    .getDefaultInstance()
                            : shopInfo_;
                }
            }
            /** <code>.HomeLimitedShopInfo shop_info = 10;</code> */
            private com.google.protobuf.SingleFieldBuilderV3<
                            emu.grasscutter.net.proto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo,
                            emu.grasscutter.net.proto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo.Builder,
                            emu.grasscutter.net.proto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfoOrBuilder>
                    getShopInfoFieldBuilder() {
                if (shopInfoBuilder_ == null) {
                    shopInfoBuilder_ =
                            new com.google.protobuf.SingleFieldBuilderV3<
                                    emu.grasscutter.net.proto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo,
                                    emu.grasscutter.net.proto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo
                                            .Builder,
                                    emu.grasscutter.net.proto.HomeLimitedShopInfoOuterClass
                                            .HomeLimitedShopInfoOrBuilder>(
                                    getShopInfo(), getParentForChildren(), isClean());
                    shopInfo_ = null;
                }
                return shopInfoBuilder_;
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

            // @@protoc_insertion_point(builder_scope:HomeLimitedShopInfoRsp)
        }

        // @@protoc_insertion_point(class_scope:HomeLimitedShopInfoRsp)
        private static final emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass
                        .HomeLimitedShopInfoRsp
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp();
        }

        public static emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<HomeLimitedShopInfoRsp> PARSER =
                new com.google.protobuf.AbstractParser<HomeLimitedShopInfoRsp>() {
                    @java.lang.Override
                    public HomeLimitedShopInfoRsp parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new HomeLimitedShopInfoRsp(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<HomeLimitedShopInfoRsp> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<HomeLimitedShopInfoRsp> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.HomeLimitedShopInfoRspOuterClass.HomeLimitedShopInfoRsp
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_HomeLimitedShopInfoRsp_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_HomeLimitedShopInfoRsp_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\034HomeLimitedShopInfoRsp.proto\032\031HomeLimi"
                    + "tedShopInfo.proto\"R\n\026HomeLimitedShopInfo"
                    + "Rsp\022\017\n\007retcode\030\006 \001(\005\022\'\n\tshop_info\030\n \001(\0132"
                    + "\024.HomeLimitedShopInfoB\033\n\031emu.grasscutter"
                    + ".net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                            emu.grasscutter.net.proto.HomeLimitedShopInfoOuterClass.getDescriptor(),
                        });
        internal_static_HomeLimitedShopInfoRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HomeLimitedShopInfoRsp_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_HomeLimitedShopInfoRsp_descriptor,
                        new java.lang.String[] {
                            "Retcode", "ShopInfo",
                        });
        emu.grasscutter.net.proto.HomeLimitedShopInfoOuterClass.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}
