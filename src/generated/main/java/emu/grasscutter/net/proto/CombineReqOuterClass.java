// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CombineReq.proto

package emu.grasscutter.net.proto;

public final class CombineReqOuterClass {
    private CombineReqOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface CombineReqOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:CombineReq)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint64 avatar_guid = 13;</code>
         *
         * @return The avatarGuid.
         */
        long getAvatarGuid();

        /**
         * <code>uint32 combine_id = 14;</code>
         *
         * @return The combineId.
         */
        int getCombineId();

        /**
         * <code>uint32 combine_count = 10;</code>
         *
         * @return The combineCount.
         */
        int getCombineCount();
    }
    /**
     *
     *
     * <pre>
     * Name: JGIODDMALOF
     * CmdId: 616
     * </pre>
     *
     * Protobuf type {@code CombineReq}
     */
    public static final class CombineReq extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:CombineReq)
            CombineReqOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use CombineReq.newBuilder() to construct.
        private CombineReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private CombineReq() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new CombineReq();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CombineReq(
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
                        case 80:
                            {
                                combineCount_ = input.readUInt32();
                                break;
                            }
                        case 104:
                            {
                                avatarGuid_ = input.readUInt64();
                                break;
                            }
                        case 112:
                            {
                                combineId_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.CombineReqOuterClass.internal_static_CombineReq_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.CombineReqOuterClass
                    .internal_static_CombineReq_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq.class,
                            emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq.Builder.class);
        }

        public static final int AVATAR_GUID_FIELD_NUMBER = 13;
        private long avatarGuid_;
        /**
         * <code>uint64 avatar_guid = 13;</code>
         *
         * @return The avatarGuid.
         */
        @java.lang.Override
        public long getAvatarGuid() {
            return avatarGuid_;
        }

        public static final int COMBINE_ID_FIELD_NUMBER = 14;
        private int combineId_;
        /**
         * <code>uint32 combine_id = 14;</code>
         *
         * @return The combineId.
         */
        @java.lang.Override
        public int getCombineId() {
            return combineId_;
        }

        public static final int COMBINE_COUNT_FIELD_NUMBER = 10;
        private int combineCount_;
        /**
         * <code>uint32 combine_count = 10;</code>
         *
         * @return The combineCount.
         */
        @java.lang.Override
        public int getCombineCount() {
            return combineCount_;
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
            if (combineCount_ != 0) {
                output.writeUInt32(10, combineCount_);
            }
            if (avatarGuid_ != 0L) {
                output.writeUInt64(13, avatarGuid_);
            }
            if (combineId_ != 0) {
                output.writeUInt32(14, combineId_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (combineCount_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(10, combineCount_);
            }
            if (avatarGuid_ != 0L) {
                size += com.google.protobuf.CodedOutputStream.computeUInt64Size(13, avatarGuid_);
            }
            if (combineId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(14, combineId_);
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
            if (!(obj instanceof emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq other =
                    (emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq) obj;

            if (getAvatarGuid() != other.getAvatarGuid()) return false;
            if (getCombineId() != other.getCombineId()) return false;
            if (getCombineCount() != other.getCombineCount()) return false;
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
            hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getAvatarGuid());
            hash = (37 * hash) + COMBINE_ID_FIELD_NUMBER;
            hash = (53 * hash) + getCombineId();
            hash = (37 * hash) + COMBINE_COUNT_FIELD_NUMBER;
            hash = (53 * hash) + getCombineCount();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq parseDelimitedFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq parseDelimitedFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq parseFrom(
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
                emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq prototype) {
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
         * Name: JGIODDMALOF
         * CmdId: 616
         * </pre>
         *
         * Protobuf type {@code CombineReq}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:CombineReq)
                emu.grasscutter.net.proto.CombineReqOuterClass.CombineReqOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.CombineReqOuterClass.internal_static_CombineReq_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.CombineReqOuterClass
                        .internal_static_CombineReq_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq.class,
                                emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq.Builder.class);
            }

            // Construct using emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq.newBuilder()
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
                avatarGuid_ = 0L;

                combineId_ = 0;

                combineCount_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.CombineReqOuterClass.internal_static_CombineReq_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq build() {
                emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq buildPartial() {
                emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq result =
                        new emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq(this);
                result.avatarGuid_ = avatarGuid_;
                result.combineId_ = combineId_;
                result.combineCount_ = combineCount_;
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
                if (other instanceof emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq) {
                    return mergeFrom((emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq other) {
                if (other == emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq.getDefaultInstance())
                    return this;
                if (other.getAvatarGuid() != 0L) {
                    setAvatarGuid(other.getAvatarGuid());
                }
                if (other.getCombineId() != 0) {
                    setCombineId(other.getCombineId());
                }
                if (other.getCombineCount() != 0) {
                    setCombineCount(other.getCombineCount());
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
                emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private long avatarGuid_;
            /**
             * <code>uint64 avatar_guid = 13;</code>
             *
             * @return The avatarGuid.
             */
            @java.lang.Override
            public long getAvatarGuid() {
                return avatarGuid_;
            }
            /**
             * <code>uint64 avatar_guid = 13;</code>
             *
             * @param value The avatarGuid to set.
             * @return This builder for chaining.
             */
            public Builder setAvatarGuid(long value) {

                avatarGuid_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint64 avatar_guid = 13;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearAvatarGuid() {

                avatarGuid_ = 0L;
                onChanged();
                return this;
            }

            private int combineId_;
            /**
             * <code>uint32 combine_id = 14;</code>
             *
             * @return The combineId.
             */
            @java.lang.Override
            public int getCombineId() {
                return combineId_;
            }
            /**
             * <code>uint32 combine_id = 14;</code>
             *
             * @param value The combineId to set.
             * @return This builder for chaining.
             */
            public Builder setCombineId(int value) {

                combineId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 combine_id = 14;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearCombineId() {

                combineId_ = 0;
                onChanged();
                return this;
            }

            private int combineCount_;
            /**
             * <code>uint32 combine_count = 10;</code>
             *
             * @return The combineCount.
             */
            @java.lang.Override
            public int getCombineCount() {
                return combineCount_;
            }
            /**
             * <code>uint32 combine_count = 10;</code>
             *
             * @param value The combineCount to set.
             * @return This builder for chaining.
             */
            public Builder setCombineCount(int value) {

                combineCount_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 combine_count = 10;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearCombineCount() {

                combineCount_ = 0;
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

            // @@protoc_insertion_point(builder_scope:CombineReq)
        }

        // @@protoc_insertion_point(class_scope:CombineReq)
        private static final emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq();
        }

        public static emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<CombineReq> PARSER =
                new com.google.protobuf.AbstractParser<CombineReq>() {
                    @java.lang.Override
                    public CombineReq parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new CombineReq(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<CombineReq> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<CombineReq> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_CombineReq_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_CombineReq_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\020CombineReq.proto\"L\n\nCombineReq\022\023\n\013avat"
                    + "ar_guid\030\r \001(\004\022\022\n\ncombine_id\030\016 \001(\r\022\025\n\rcom"
                    + "bine_count\030\n \001(\rB\033\n\031emu.grasscutter.net."
                    + "protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_CombineReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CombineReq_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_CombineReq_descriptor,
                        new java.lang.String[] {
                            "AvatarGuid", "CombineId", "CombineCount",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
