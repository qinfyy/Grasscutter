// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InvestigationQuestDailyNotify.proto

package emu.grasscutter.net.proto;

public final class InvestigationQuestDailyNotifyOuterClass {
    private InvestigationQuestDailyNotifyOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface InvestigationQuestDailyNotifyOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:InvestigationQuestDailyNotify)
            com.google.protobuf.MessageOrBuilder {}
    /**
     *
     *
     * <pre>
     * Name: BIILPLIEGPD
     * CmdId: 1902
     * </pre>
     *
     * Protobuf type {@code InvestigationQuestDailyNotify}
     */
    public static final class InvestigationQuestDailyNotify
            extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:InvestigationQuestDailyNotify)
            InvestigationQuestDailyNotifyOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use InvestigationQuestDailyNotify.newBuilder() to construct.
        private InvestigationQuestDailyNotify(
                com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private InvestigationQuestDailyNotify() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new InvestigationQuestDailyNotify();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private InvestigationQuestDailyNotify(
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
            return emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                    .internal_static_InvestigationQuestDailyNotify_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                    .internal_static_InvestigationQuestDailyNotify_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                                    .InvestigationQuestDailyNotify.class,
                            emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                                    .InvestigationQuestDailyNotify.Builder.class);
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
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
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
                    emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                            .InvestigationQuestDailyNotify)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                            .InvestigationQuestDailyNotify
                    other =
                            (emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                                            .InvestigationQuestDailyNotify)
                                    obj;

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
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                        .InvestigationQuestDailyNotify
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                        .InvestigationQuestDailyNotify
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                        .InvestigationQuestDailyNotify
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                        .InvestigationQuestDailyNotify
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                        .InvestigationQuestDailyNotify
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                        .InvestigationQuestDailyNotify
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                        .InvestigationQuestDailyNotify
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                        .InvestigationQuestDailyNotify
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                        .InvestigationQuestDailyNotify
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                        .InvestigationQuestDailyNotify
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                        .InvestigationQuestDailyNotify
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                        .InvestigationQuestDailyNotify
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
                emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                                .InvestigationQuestDailyNotify
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
         * Name: BIILPLIEGPD
         * CmdId: 1902
         * </pre>
         *
         * Protobuf type {@code InvestigationQuestDailyNotify}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:InvestigationQuestDailyNotify)
                emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                        .InvestigationQuestDailyNotifyOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                        .internal_static_InvestigationQuestDailyNotify_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                        .internal_static_InvestigationQuestDailyNotify_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                                        .InvestigationQuestDailyNotify.class,
                                emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                                        .InvestigationQuestDailyNotify.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass.InvestigationQuestDailyNotify.newBuilder()
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
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                        .internal_static_InvestigationQuestDailyNotify_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                            .InvestigationQuestDailyNotify
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                        .InvestigationQuestDailyNotify.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                            .InvestigationQuestDailyNotify
                    build() {
                emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                                .InvestigationQuestDailyNotify
                        result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                            .InvestigationQuestDailyNotify
                    buildPartial() {
                emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                                .InvestigationQuestDailyNotify
                        result =
                                new emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                                        .InvestigationQuestDailyNotify(this);
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
                        emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                                .InvestigationQuestDailyNotify) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                                            .InvestigationQuestDailyNotify)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                                    .InvestigationQuestDailyNotify
                            other) {
                if (other
                        == emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                                .InvestigationQuestDailyNotify.getDefaultInstance()) return this;
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
                emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                                .InvestigationQuestDailyNotify
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                                            .InvestigationQuestDailyNotify)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
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

            // @@protoc_insertion_point(builder_scope:InvestigationQuestDailyNotify)
        }

        // @@protoc_insertion_point(class_scope:InvestigationQuestDailyNotify)
        private static final emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                        .InvestigationQuestDailyNotify
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                            .InvestigationQuestDailyNotify();
        }

        public static emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                        .InvestigationQuestDailyNotify
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<InvestigationQuestDailyNotify> PARSER =
                new com.google.protobuf.AbstractParser<InvestigationQuestDailyNotify>() {
                    @java.lang.Override
                    public InvestigationQuestDailyNotify parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new InvestigationQuestDailyNotify(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<InvestigationQuestDailyNotify> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<InvestigationQuestDailyNotify> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.InvestigationQuestDailyNotifyOuterClass
                        .InvestigationQuestDailyNotify
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_InvestigationQuestDailyNotify_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_InvestigationQuestDailyNotify_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n#InvestigationQuestDailyNotify.proto\"\037\n"
                    + "\035InvestigationQuestDailyNotifyB\033\n\031emu.gr"
                    + "asscutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_InvestigationQuestDailyNotify_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_InvestigationQuestDailyNotify_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_InvestigationQuestDailyNotify_descriptor, new java.lang.String[] {});
    }

    // @@protoc_insertion_point(outer_class_scope)
}
