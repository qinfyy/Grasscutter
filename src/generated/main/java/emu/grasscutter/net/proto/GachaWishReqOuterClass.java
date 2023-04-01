// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GachaWishReq.proto

package emu.grasscutter.net.proto;

public final class GachaWishReqOuterClass {
    private GachaWishReqOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface GachaWishReqOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:GachaWishReq)
            com.google.protobuf.MessageOrBuilder {

        /**
         *
         *
         * <pre>
         * NMKGGDOKHLF
         * </pre>
         *
         * <code>uint32 gachaScheduleId = 9;</code>
         *
         * @return The gachaScheduleId.
         */
        int getGachaScheduleId();

        /**
         * <code>uint32 item_id = 11;</code>
         *
         * @return The itemId.
         */
        int getItemId();

        /**
         *
         *
         * <pre>
         * DGIFMDIADJF
         * </pre>
         *
         * <code>uint32 gachaType = 5;</code>
         *
         * @return The gachaType.
         */
        int getGachaType();
    }
    /**
     *
     *
     * <pre>
     * Name: HEEOPFJGOKN
     * CmdId: 1514
     * </pre>
     *
     * Protobuf type {@code GachaWishReq}
     */
    public static final class GachaWishReq extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:GachaWishReq)
            GachaWishReqOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use GachaWishReq.newBuilder() to construct.
        private GachaWishReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private GachaWishReq() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new GachaWishReq();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GachaWishReq(
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
                        case 40:
                            {
                                gachaType_ = input.readUInt32();
                                break;
                            }
                        case 72:
                            {
                                gachaScheduleId_ = input.readUInt32();
                                break;
                            }
                        case 88:
                            {
                                itemId_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.GachaWishReqOuterClass
                    .internal_static_GachaWishReq_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.GachaWishReqOuterClass
                    .internal_static_GachaWishReq_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq.class,
                            emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq.Builder.class);
        }

        public static final int GACHASCHEDULEID_FIELD_NUMBER = 9;
        private int gachaScheduleId_;
        /**
         *
         *
         * <pre>
         * NMKGGDOKHLF
         * </pre>
         *
         * <code>uint32 gachaScheduleId = 9;</code>
         *
         * @return The gachaScheduleId.
         */
        @java.lang.Override
        public int getGachaScheduleId() {
            return gachaScheduleId_;
        }

        public static final int ITEM_ID_FIELD_NUMBER = 11;
        private int itemId_;
        /**
         * <code>uint32 item_id = 11;</code>
         *
         * @return The itemId.
         */
        @java.lang.Override
        public int getItemId() {
            return itemId_;
        }

        public static final int GACHATYPE_FIELD_NUMBER = 5;
        private int gachaType_;
        /**
         *
         *
         * <pre>
         * DGIFMDIADJF
         * </pre>
         *
         * <code>uint32 gachaType = 5;</code>
         *
         * @return The gachaType.
         */
        @java.lang.Override
        public int getGachaType() {
            return gachaType_;
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
            if (gachaType_ != 0) {
                output.writeUInt32(5, gachaType_);
            }
            if (gachaScheduleId_ != 0) {
                output.writeUInt32(9, gachaScheduleId_);
            }
            if (itemId_ != 0) {
                output.writeUInt32(11, itemId_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (gachaType_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(5, gachaType_);
            }
            if (gachaScheduleId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(9, gachaScheduleId_);
            }
            if (itemId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(11, itemId_);
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
            if (!(obj instanceof emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq other =
                    (emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq) obj;

            if (getGachaScheduleId() != other.getGachaScheduleId()) return false;
            if (getItemId() != other.getItemId()) return false;
            if (getGachaType() != other.getGachaType()) return false;
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
            hash = (37 * hash) + GACHASCHEDULEID_FIELD_NUMBER;
            hash = (53 * hash) + getGachaScheduleId();
            hash = (37 * hash) + ITEM_ID_FIELD_NUMBER;
            hash = (53 * hash) + getItemId();
            hash = (37 * hash) + GACHATYPE_FIELD_NUMBER;
            hash = (53 * hash) + getGachaType();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq parseFrom(
                byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq parseDelimitedFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq parseDelimitedFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq parseFrom(
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
                emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq prototype) {
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
         * Name: HEEOPFJGOKN
         * CmdId: 1514
         * </pre>
         *
         * Protobuf type {@code GachaWishReq}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:GachaWishReq)
                emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReqOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.GachaWishReqOuterClass
                        .internal_static_GachaWishReq_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.GachaWishReqOuterClass
                        .internal_static_GachaWishReq_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq.class,
                                emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq.Builder.class);
            }

            // Construct using emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq.newBuilder()
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
                gachaScheduleId_ = 0;

                itemId_ = 0;

                gachaType_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.GachaWishReqOuterClass
                        .internal_static_GachaWishReq_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq build() {
                emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq buildPartial() {
                emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq result =
                        new emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq(this);
                result.gachaScheduleId_ = gachaScheduleId_;
                result.itemId_ = itemId_;
                result.gachaType_ = gachaType_;
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
                if (other instanceof emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq) {
                    return mergeFrom((emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq other) {
                if (other
                        == emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq.getDefaultInstance())
                    return this;
                if (other.getGachaScheduleId() != 0) {
                    setGachaScheduleId(other.getGachaScheduleId());
                }
                if (other.getItemId() != 0) {
                    setItemId(other.getItemId());
                }
                if (other.getGachaType() != 0) {
                    setGachaType(other.getGachaType());
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
                emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int gachaScheduleId_;
            /**
             *
             *
             * <pre>
             * NMKGGDOKHLF
             * </pre>
             *
             * <code>uint32 gachaScheduleId = 9;</code>
             *
             * @return The gachaScheduleId.
             */
            @java.lang.Override
            public int getGachaScheduleId() {
                return gachaScheduleId_;
            }
            /**
             *
             *
             * <pre>
             * NMKGGDOKHLF
             * </pre>
             *
             * <code>uint32 gachaScheduleId = 9;</code>
             *
             * @param value The gachaScheduleId to set.
             * @return This builder for chaining.
             */
            public Builder setGachaScheduleId(int value) {

                gachaScheduleId_ = value;
                onChanged();
                return this;
            }
            /**
             *
             *
             * <pre>
             * NMKGGDOKHLF
             * </pre>
             *
             * <code>uint32 gachaScheduleId = 9;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearGachaScheduleId() {

                gachaScheduleId_ = 0;
                onChanged();
                return this;
            }

            private int itemId_;
            /**
             * <code>uint32 item_id = 11;</code>
             *
             * @return The itemId.
             */
            @java.lang.Override
            public int getItemId() {
                return itemId_;
            }
            /**
             * <code>uint32 item_id = 11;</code>
             *
             * @param value The itemId to set.
             * @return This builder for chaining.
             */
            public Builder setItemId(int value) {

                itemId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 item_id = 11;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearItemId() {

                itemId_ = 0;
                onChanged();
                return this;
            }

            private int gachaType_;
            /**
             *
             *
             * <pre>
             * DGIFMDIADJF
             * </pre>
             *
             * <code>uint32 gachaType = 5;</code>
             *
             * @return The gachaType.
             */
            @java.lang.Override
            public int getGachaType() {
                return gachaType_;
            }
            /**
             *
             *
             * <pre>
             * DGIFMDIADJF
             * </pre>
             *
             * <code>uint32 gachaType = 5;</code>
             *
             * @param value The gachaType to set.
             * @return This builder for chaining.
             */
            public Builder setGachaType(int value) {

                gachaType_ = value;
                onChanged();
                return this;
            }
            /**
             *
             *
             * <pre>
             * DGIFMDIADJF
             * </pre>
             *
             * <code>uint32 gachaType = 5;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearGachaType() {

                gachaType_ = 0;
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

            // @@protoc_insertion_point(builder_scope:GachaWishReq)
        }

        // @@protoc_insertion_point(class_scope:GachaWishReq)
        private static final emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq();
        }

        public static emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<GachaWishReq> PARSER =
                new com.google.protobuf.AbstractParser<GachaWishReq>() {
                    @java.lang.Override
                    public GachaWishReq parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new GachaWishReq(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<GachaWishReq> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<GachaWishReq> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.GachaWishReqOuterClass.GachaWishReq
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_GachaWishReq_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_GachaWishReq_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\022GachaWishReq.proto\"K\n\014GachaWishReq\022\027\n\017"
                    + "gachaScheduleId\030\t \001(\r\022\017\n\007item_id\030\013 \001(\r\022\021"
                    + "\n\tgachaType\030\005 \001(\rB\033\n\031emu.grasscutter.net"
                    + ".protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_GachaWishReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GachaWishReq_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_GachaWishReq_descriptor,
                        new java.lang.String[] {
                            "GachaScheduleId", "ItemId", "GachaType",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
