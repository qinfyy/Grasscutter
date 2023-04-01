// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TanukiTravelLevelData.proto

package emu.grasscutter.net.proto;

public final class TanukiTravelLevelDataOuterClass {
    private TanukiTravelLevelDataOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface TanukiTravelLevelDataOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:TanukiTravelLevelData)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>bool is_open = 7;</code>
         *
         * @return The isOpen.
         */
        boolean getIsOpen();

        /**
         * <code>uint32 route_id = 5;</code>
         *
         * @return The routeId.
         */
        int getRouteId();

        /**
         * <code>bool is_finish = 9;</code>
         *
         * @return The isFinish.
         */
        boolean getIsFinish();
    }
    /**
     *
     *
     * <pre>
     * Name: CCIIHPEKIPM
     * </pre>
     *
     * Protobuf type {@code TanukiTravelLevelData}
     */
    public static final class TanukiTravelLevelData extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:TanukiTravelLevelData)
            TanukiTravelLevelDataOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use TanukiTravelLevelData.newBuilder() to construct.
        private TanukiTravelLevelData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private TanukiTravelLevelData() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new TanukiTravelLevelData();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private TanukiTravelLevelData(
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
                                routeId_ = input.readUInt32();
                                break;
                            }
                        case 56:
                            {
                                isOpen_ = input.readBool();
                                break;
                            }
                        case 72:
                            {
                                isFinish_ = input.readBool();
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
            return emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass
                    .internal_static_TanukiTravelLevelData_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass
                    .internal_static_TanukiTravelLevelData_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData.class,
                            emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData
                                    .Builder.class);
        }

        public static final int IS_OPEN_FIELD_NUMBER = 7;
        private boolean isOpen_;
        /**
         * <code>bool is_open = 7;</code>
         *
         * @return The isOpen.
         */
        @java.lang.Override
        public boolean getIsOpen() {
            return isOpen_;
        }

        public static final int ROUTE_ID_FIELD_NUMBER = 5;
        private int routeId_;
        /**
         * <code>uint32 route_id = 5;</code>
         *
         * @return The routeId.
         */
        @java.lang.Override
        public int getRouteId() {
            return routeId_;
        }

        public static final int IS_FINISH_FIELD_NUMBER = 9;
        private boolean isFinish_;
        /**
         * <code>bool is_finish = 9;</code>
         *
         * @return The isFinish.
         */
        @java.lang.Override
        public boolean getIsFinish() {
            return isFinish_;
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
            if (routeId_ != 0) {
                output.writeUInt32(5, routeId_);
            }
            if (isOpen_ != false) {
                output.writeBool(7, isOpen_);
            }
            if (isFinish_ != false) {
                output.writeBool(9, isFinish_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (routeId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(5, routeId_);
            }
            if (isOpen_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(7, isOpen_);
            }
            if (isFinish_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(9, isFinish_);
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
                    emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData other =
                    (emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData) obj;

            if (getIsOpen() != other.getIsOpen()) return false;
            if (getRouteId() != other.getRouteId()) return false;
            if (getIsFinish() != other.getIsFinish()) return false;
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
            hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsOpen());
            hash = (37 * hash) + ROUTE_ID_FIELD_NUMBER;
            hash = (53 * hash) + getRouteId();
            hash = (37 * hash) + IS_FINISH_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsFinish());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData
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
                emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData prototype) {
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
         * Name: CCIIHPEKIPM
         * </pre>
         *
         * Protobuf type {@code TanukiTravelLevelData}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:TanukiTravelLevelData)
                emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelDataOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass
                        .internal_static_TanukiTravelLevelData_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass
                        .internal_static_TanukiTravelLevelData_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData
                                        .class,
                                emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData
                                        .Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData.newBuilder()
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
                isOpen_ = false;

                routeId_ = 0;

                isFinish_ = false;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass
                        .internal_static_TanukiTravelLevelData_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData
                    build() {
                emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData
                    buildPartial() {
                emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData result =
                        new emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData(
                                this);
                result.isOpen_ = isOpen_;
                result.routeId_ = routeId_;
                result.isFinish_ = isFinish_;
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
                        emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData other) {
                if (other
                        == emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData
                                .getDefaultInstance()) return this;
                if (other.getIsOpen() != false) {
                    setIsOpen(other.getIsOpen());
                }
                if (other.getRouteId() != 0) {
                    setRouteId(other.getRouteId());
                }
                if (other.getIsFinish() != false) {
                    setIsFinish(other.getIsFinish());
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
                emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private boolean isOpen_;
            /**
             * <code>bool is_open = 7;</code>
             *
             * @return The isOpen.
             */
            @java.lang.Override
            public boolean getIsOpen() {
                return isOpen_;
            }
            /**
             * <code>bool is_open = 7;</code>
             *
             * @param value The isOpen to set.
             * @return This builder for chaining.
             */
            public Builder setIsOpen(boolean value) {

                isOpen_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool is_open = 7;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsOpen() {

                isOpen_ = false;
                onChanged();
                return this;
            }

            private int routeId_;
            /**
             * <code>uint32 route_id = 5;</code>
             *
             * @return The routeId.
             */
            @java.lang.Override
            public int getRouteId() {
                return routeId_;
            }
            /**
             * <code>uint32 route_id = 5;</code>
             *
             * @param value The routeId to set.
             * @return This builder for chaining.
             */
            public Builder setRouteId(int value) {

                routeId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 route_id = 5;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearRouteId() {

                routeId_ = 0;
                onChanged();
                return this;
            }

            private boolean isFinish_;
            /**
             * <code>bool is_finish = 9;</code>
             *
             * @return The isFinish.
             */
            @java.lang.Override
            public boolean getIsFinish() {
                return isFinish_;
            }
            /**
             * <code>bool is_finish = 9;</code>
             *
             * @param value The isFinish to set.
             * @return This builder for chaining.
             */
            public Builder setIsFinish(boolean value) {

                isFinish_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool is_finish = 9;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsFinish() {

                isFinish_ = false;
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

            // @@protoc_insertion_point(builder_scope:TanukiTravelLevelData)
        }

        // @@protoc_insertion_point(class_scope:TanukiTravelLevelData)
        private static final emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass
                        .TanukiTravelLevelData
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData();
        }

        public static emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<TanukiTravelLevelData> PARSER =
                new com.google.protobuf.AbstractParser<TanukiTravelLevelData>() {
                    @java.lang.Override
                    public TanukiTravelLevelData parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new TanukiTravelLevelData(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<TanukiTravelLevelData> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<TanukiTravelLevelData> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.TanukiTravelLevelDataOuterClass.TanukiTravelLevelData
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_TanukiTravelLevelData_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_TanukiTravelLevelData_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\033TanukiTravelLevelData.proto\"M\n\025TanukiT"
                    + "ravelLevelData\022\017\n\007is_open\030\007 \001(\010\022\020\n\010route"
                    + "_id\030\005 \001(\r\022\021\n\tis_finish\030\t \001(\010B\033\n\031emu.gras"
                    + "scutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_TanukiTravelLevelData_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_TanukiTravelLevelData_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_TanukiTravelLevelData_descriptor,
                        new java.lang.String[] {
                            "IsOpen", "RouteId", "IsFinish",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
