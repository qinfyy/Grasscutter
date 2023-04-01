// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeModuleUnlockNotify.proto

package emu.grasscutter.net.proto;

public final class HomeModuleUnlockNotifyOuterClass {
    private HomeModuleUnlockNotifyOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface HomeModuleUnlockNotifyOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:HomeModuleUnlockNotify)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 module_id = 6;</code>
         *
         * @return The moduleId.
         */
        int getModuleId();
    }
    /**
     *
     *
     * <pre>
     * Name: BJCKAJNCINB
     * CmdId: 4700
     * </pre>
     *
     * Protobuf type {@code HomeModuleUnlockNotify}
     */
    public static final class HomeModuleUnlockNotify extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:HomeModuleUnlockNotify)
            HomeModuleUnlockNotifyOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use HomeModuleUnlockNotify.newBuilder() to construct.
        private HomeModuleUnlockNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private HomeModuleUnlockNotify() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new HomeModuleUnlockNotify();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private HomeModuleUnlockNotify(
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
                                moduleId_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass
                    .internal_static_HomeModuleUnlockNotify_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass
                    .internal_static_HomeModuleUnlockNotify_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify
                                    .class,
                            emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify
                                    .Builder.class);
        }

        public static final int MODULE_ID_FIELD_NUMBER = 6;
        private int moduleId_;
        /**
         * <code>uint32 module_id = 6;</code>
         *
         * @return The moduleId.
         */
        @java.lang.Override
        public int getModuleId() {
            return moduleId_;
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
            if (moduleId_ != 0) {
                output.writeUInt32(6, moduleId_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (moduleId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(6, moduleId_);
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
                    emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify other =
                    (emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify) obj;

            if (getModuleId() != other.getModuleId()) return false;
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
            hash = (37 * hash) + MODULE_ID_FIELD_NUMBER;
            hash = (53 * hash) + getModuleId();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify
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
                emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify
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
         * Name: BJCKAJNCINB
         * CmdId: 4700
         * </pre>
         *
         * Protobuf type {@code HomeModuleUnlockNotify}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:HomeModuleUnlockNotify)
                emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotifyOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass
                        .internal_static_HomeModuleUnlockNotify_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass
                        .internal_static_HomeModuleUnlockNotify_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify
                                        .class,
                                emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify
                                        .Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify.newBuilder()
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
                moduleId_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass
                        .internal_static_HomeModuleUnlockNotify_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify
                    build() {
                emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify
                    buildPartial() {
                emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify result =
                        new emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify(
                                this);
                result.moduleId_ = moduleId_;
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
                        emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify other) {
                if (other
                        == emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify
                                .getDefaultInstance()) return this;
                if (other.getModuleId() != 0) {
                    setModuleId(other.getModuleId());
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
                emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int moduleId_;
            /**
             * <code>uint32 module_id = 6;</code>
             *
             * @return The moduleId.
             */
            @java.lang.Override
            public int getModuleId() {
                return moduleId_;
            }
            /**
             * <code>uint32 module_id = 6;</code>
             *
             * @param value The moduleId to set.
             * @return This builder for chaining.
             */
            public Builder setModuleId(int value) {

                moduleId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 module_id = 6;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearModuleId() {

                moduleId_ = 0;
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

            // @@protoc_insertion_point(builder_scope:HomeModuleUnlockNotify)
        }

        // @@protoc_insertion_point(class_scope:HomeModuleUnlockNotify)
        private static final emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass
                        .HomeModuleUnlockNotify
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify();
        }

        public static emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<HomeModuleUnlockNotify> PARSER =
                new com.google.protobuf.AbstractParser<HomeModuleUnlockNotify>() {
                    @java.lang.Override
                    public HomeModuleUnlockNotify parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new HomeModuleUnlockNotify(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<HomeModuleUnlockNotify> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<HomeModuleUnlockNotify> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.HomeModuleUnlockNotifyOuterClass.HomeModuleUnlockNotify
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_HomeModuleUnlockNotify_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_HomeModuleUnlockNotify_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\034HomeModuleUnlockNotify.proto\"+\n\026HomeMo"
                    + "duleUnlockNotify\022\021\n\tmodule_id\030\006 \001(\rB\033\n\031e"
                    + "mu.grasscutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_HomeModuleUnlockNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HomeModuleUnlockNotify_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_HomeModuleUnlockNotify_descriptor,
                        new java.lang.String[] {
                            "ModuleId",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
