// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerGetForceQuitBanInfoRsp.proto

package emu.grasscutter.net.proto;

public final class PlayerGetForceQuitBanInfoRspOuterClass {
    private PlayerGetForceQuitBanInfoRspOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface PlayerGetForceQuitBanInfoRspOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:PlayerGetForceQuitBanInfoRsp)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int32 retcode = 6;</code>
         *
         * @return The retcode.
         */
        int getRetcode();

        /**
         * <code>uint32 match_id = 7;</code>
         *
         * @return The matchId.
         */
        int getMatchId();

        /**
         * <code>uint32 expire_time = 11;</code>
         *
         * @return The expireTime.
         */
        int getExpireTime();
    }
    /**
     *
     *
     * <pre>
     * Name: NOLOHBKIHLJ
     * CmdId: 4176
     * </pre>
     *
     * Protobuf type {@code PlayerGetForceQuitBanInfoRsp}
     */
    public static final class PlayerGetForceQuitBanInfoRsp
            extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:PlayerGetForceQuitBanInfoRsp)
            PlayerGetForceQuitBanInfoRspOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use PlayerGetForceQuitBanInfoRsp.newBuilder() to construct.
        private PlayerGetForceQuitBanInfoRsp(
                com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private PlayerGetForceQuitBanInfoRsp() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new PlayerGetForceQuitBanInfoRsp();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private PlayerGetForceQuitBanInfoRsp(
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
                        case 56:
                            {
                                matchId_ = input.readUInt32();
                                break;
                            }
                        case 88:
                            {
                                expireTime_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                    .internal_static_PlayerGetForceQuitBanInfoRsp_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                    .internal_static_PlayerGetForceQuitBanInfoRsp_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                                    .PlayerGetForceQuitBanInfoRsp.class,
                            emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                                    .PlayerGetForceQuitBanInfoRsp.Builder.class);
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

        public static final int MATCH_ID_FIELD_NUMBER = 7;
        private int matchId_;
        /**
         * <code>uint32 match_id = 7;</code>
         *
         * @return The matchId.
         */
        @java.lang.Override
        public int getMatchId() {
            return matchId_;
        }

        public static final int EXPIRE_TIME_FIELD_NUMBER = 11;
        private int expireTime_;
        /**
         * <code>uint32 expire_time = 11;</code>
         *
         * @return The expireTime.
         */
        @java.lang.Override
        public int getExpireTime() {
            return expireTime_;
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
            if (matchId_ != 0) {
                output.writeUInt32(7, matchId_);
            }
            if (expireTime_ != 0) {
                output.writeUInt32(11, expireTime_);
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
            if (matchId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(7, matchId_);
            }
            if (expireTime_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(11, expireTime_);
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
                    emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                            .PlayerGetForceQuitBanInfoRsp)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass.PlayerGetForceQuitBanInfoRsp
                    other =
                            (emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                                            .PlayerGetForceQuitBanInfoRsp)
                                    obj;

            if (getRetcode() != other.getRetcode()) return false;
            if (getMatchId() != other.getMatchId()) return false;
            if (getExpireTime() != other.getExpireTime()) return false;
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
            hash = (37 * hash) + MATCH_ID_FIELD_NUMBER;
            hash = (53 * hash) + getMatchId();
            hash = (37 * hash) + EXPIRE_TIME_FIELD_NUMBER;
            hash = (53 * hash) + getExpireTime();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                        .PlayerGetForceQuitBanInfoRsp
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                        .PlayerGetForceQuitBanInfoRsp
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                        .PlayerGetForceQuitBanInfoRsp
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                        .PlayerGetForceQuitBanInfoRsp
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                        .PlayerGetForceQuitBanInfoRsp
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                        .PlayerGetForceQuitBanInfoRsp
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                        .PlayerGetForceQuitBanInfoRsp
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                        .PlayerGetForceQuitBanInfoRsp
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                        .PlayerGetForceQuitBanInfoRsp
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                        .PlayerGetForceQuitBanInfoRsp
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                        .PlayerGetForceQuitBanInfoRsp
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                        .PlayerGetForceQuitBanInfoRsp
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
                emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                                .PlayerGetForceQuitBanInfoRsp
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
         * Name: NOLOHBKIHLJ
         * CmdId: 4176
         * </pre>
         *
         * Protobuf type {@code PlayerGetForceQuitBanInfoRsp}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:PlayerGetForceQuitBanInfoRsp)
                emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                        .PlayerGetForceQuitBanInfoRspOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                        .internal_static_PlayerGetForceQuitBanInfoRsp_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                        .internal_static_PlayerGetForceQuitBanInfoRsp_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                                        .PlayerGetForceQuitBanInfoRsp.class,
                                emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                                        .PlayerGetForceQuitBanInfoRsp.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass.PlayerGetForceQuitBanInfoRsp.newBuilder()
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

                matchId_ = 0;

                expireTime_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                        .internal_static_PlayerGetForceQuitBanInfoRsp_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                            .PlayerGetForceQuitBanInfoRsp
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                        .PlayerGetForceQuitBanInfoRsp.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                            .PlayerGetForceQuitBanInfoRsp
                    build() {
                emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                                .PlayerGetForceQuitBanInfoRsp
                        result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                            .PlayerGetForceQuitBanInfoRsp
                    buildPartial() {
                emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                                .PlayerGetForceQuitBanInfoRsp
                        result =
                                new emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                                        .PlayerGetForceQuitBanInfoRsp(this);
                result.retcode_ = retcode_;
                result.matchId_ = matchId_;
                result.expireTime_ = expireTime_;
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
                        emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                                .PlayerGetForceQuitBanInfoRsp) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                                            .PlayerGetForceQuitBanInfoRsp)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                                    .PlayerGetForceQuitBanInfoRsp
                            other) {
                if (other
                        == emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                                .PlayerGetForceQuitBanInfoRsp.getDefaultInstance()) return this;
                if (other.getRetcode() != 0) {
                    setRetcode(other.getRetcode());
                }
                if (other.getMatchId() != 0) {
                    setMatchId(other.getMatchId());
                }
                if (other.getExpireTime() != 0) {
                    setExpireTime(other.getExpireTime());
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
                emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                                .PlayerGetForceQuitBanInfoRsp
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                                            .PlayerGetForceQuitBanInfoRsp)
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

            private int matchId_;
            /**
             * <code>uint32 match_id = 7;</code>
             *
             * @return The matchId.
             */
            @java.lang.Override
            public int getMatchId() {
                return matchId_;
            }
            /**
             * <code>uint32 match_id = 7;</code>
             *
             * @param value The matchId to set.
             * @return This builder for chaining.
             */
            public Builder setMatchId(int value) {

                matchId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 match_id = 7;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearMatchId() {

                matchId_ = 0;
                onChanged();
                return this;
            }

            private int expireTime_;
            /**
             * <code>uint32 expire_time = 11;</code>
             *
             * @return The expireTime.
             */
            @java.lang.Override
            public int getExpireTime() {
                return expireTime_;
            }
            /**
             * <code>uint32 expire_time = 11;</code>
             *
             * @param value The expireTime to set.
             * @return This builder for chaining.
             */
            public Builder setExpireTime(int value) {

                expireTime_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 expire_time = 11;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearExpireTime() {

                expireTime_ = 0;
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

            // @@protoc_insertion_point(builder_scope:PlayerGetForceQuitBanInfoRsp)
        }

        // @@protoc_insertion_point(class_scope:PlayerGetForceQuitBanInfoRsp)
        private static final emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                        .PlayerGetForceQuitBanInfoRsp
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                            .PlayerGetForceQuitBanInfoRsp();
        }

        public static emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                        .PlayerGetForceQuitBanInfoRsp
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<PlayerGetForceQuitBanInfoRsp> PARSER =
                new com.google.protobuf.AbstractParser<PlayerGetForceQuitBanInfoRsp>() {
                    @java.lang.Override
                    public PlayerGetForceQuitBanInfoRsp parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new PlayerGetForceQuitBanInfoRsp(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<PlayerGetForceQuitBanInfoRsp> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<PlayerGetForceQuitBanInfoRsp> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.PlayerGetForceQuitBanInfoRspOuterClass
                        .PlayerGetForceQuitBanInfoRsp
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_PlayerGetForceQuitBanInfoRsp_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_PlayerGetForceQuitBanInfoRsp_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\"PlayerGetForceQuitBanInfoRsp.proto\"V\n\034"
                    + "PlayerGetForceQuitBanInfoRsp\022\017\n\007retcode\030"
                    + "\006 \001(\005\022\020\n\010match_id\030\007 \001(\r\022\023\n\013expire_time\030\013"
                    + " \001(\rB\033\n\031emu.grasscutter.net.protob\006proto"
                    + "3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_PlayerGetForceQuitBanInfoRsp_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_PlayerGetForceQuitBanInfoRsp_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_PlayerGetForceQuitBanInfoRsp_descriptor,
                        new java.lang.String[] {
                            "Retcode", "MatchId", "ExpireTime",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
