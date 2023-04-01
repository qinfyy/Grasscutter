// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityEmbryo.proto

package emu.grasscutter.net.proto;

public final class AbilityEmbryoOuterClass {
    private AbilityEmbryoOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface AbilityEmbryoOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:AbilityEmbryo)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 ability_id = 1;</code>
         *
         * @return The abilityId.
         */
        int getAbilityId();

        /**
         * <code>fixed32 ability_name_hash = 2;</code>
         *
         * @return The abilityNameHash.
         */
        int getAbilityNameHash();

        /**
         * <code>fixed32 ability_override_name_hash = 3;</code>
         *
         * @return The abilityOverrideNameHash.
         */
        int getAbilityOverrideNameHash();
    }
    /**
     *
     *
     * <pre>
     * Name: FDIGHNLIKGA
     * </pre>
     *
     * Protobuf type {@code AbilityEmbryo}
     */
    public static final class AbilityEmbryo extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:AbilityEmbryo)
            AbilityEmbryoOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use AbilityEmbryo.newBuilder() to construct.
        private AbilityEmbryo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private AbilityEmbryo() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new AbilityEmbryo();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private AbilityEmbryo(
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
                        case 8:
                            {
                                abilityId_ = input.readUInt32();
                                break;
                            }
                        case 21:
                            {
                                abilityNameHash_ = input.readFixed32();
                                break;
                            }
                        case 29:
                            {
                                abilityOverrideNameHash_ = input.readFixed32();
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
            return emu.grasscutter.net.proto.AbilityEmbryoOuterClass
                    .internal_static_AbilityEmbryo_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.AbilityEmbryoOuterClass
                    .internal_static_AbilityEmbryo_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo.class,
                            emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo.Builder.class);
        }

        public static final int ABILITY_ID_FIELD_NUMBER = 1;
        private int abilityId_;
        /**
         * <code>uint32 ability_id = 1;</code>
         *
         * @return The abilityId.
         */
        @java.lang.Override
        public int getAbilityId() {
            return abilityId_;
        }

        public static final int ABILITY_NAME_HASH_FIELD_NUMBER = 2;
        private int abilityNameHash_;
        /**
         * <code>fixed32 ability_name_hash = 2;</code>
         *
         * @return The abilityNameHash.
         */
        @java.lang.Override
        public int getAbilityNameHash() {
            return abilityNameHash_;
        }

        public static final int ABILITY_OVERRIDE_NAME_HASH_FIELD_NUMBER = 3;
        private int abilityOverrideNameHash_;
        /**
         * <code>fixed32 ability_override_name_hash = 3;</code>
         *
         * @return The abilityOverrideNameHash.
         */
        @java.lang.Override
        public int getAbilityOverrideNameHash() {
            return abilityOverrideNameHash_;
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
            if (abilityId_ != 0) {
                output.writeUInt32(1, abilityId_);
            }
            if (abilityNameHash_ != 0) {
                output.writeFixed32(2, abilityNameHash_);
            }
            if (abilityOverrideNameHash_ != 0) {
                output.writeFixed32(3, abilityOverrideNameHash_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (abilityId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(1, abilityId_);
            }
            if (abilityNameHash_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeFixed32Size(2, abilityNameHash_);
            }
            if (abilityOverrideNameHash_ != 0) {
                size +=
                        com.google.protobuf.CodedOutputStream.computeFixed32Size(3, abilityOverrideNameHash_);
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
            if (!(obj instanceof emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo other =
                    (emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo) obj;

            if (getAbilityId() != other.getAbilityId()) return false;
            if (getAbilityNameHash() != other.getAbilityNameHash()) return false;
            if (getAbilityOverrideNameHash() != other.getAbilityOverrideNameHash()) return false;
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
            hash = (37 * hash) + ABILITY_ID_FIELD_NUMBER;
            hash = (53 * hash) + getAbilityId();
            hash = (37 * hash) + ABILITY_NAME_HASH_FIELD_NUMBER;
            hash = (53 * hash) + getAbilityNameHash();
            hash = (37 * hash) + ABILITY_OVERRIDE_NAME_HASH_FIELD_NUMBER;
            hash = (53 * hash) + getAbilityOverrideNameHash();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo parseFrom(
                byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo parseFrom(
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
                emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo prototype) {
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
         * Name: FDIGHNLIKGA
         * </pre>
         *
         * Protobuf type {@code AbilityEmbryo}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:AbilityEmbryo)
                emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryoOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.AbilityEmbryoOuterClass
                        .internal_static_AbilityEmbryo_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.AbilityEmbryoOuterClass
                        .internal_static_AbilityEmbryo_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo.class,
                                emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo.newBuilder()
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
                abilityId_ = 0;

                abilityNameHash_ = 0;

                abilityOverrideNameHash_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.AbilityEmbryoOuterClass
                        .internal_static_AbilityEmbryo_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo build() {
                emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo buildPartial() {
                emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo result =
                        new emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo(this);
                result.abilityId_ = abilityId_;
                result.abilityNameHash_ = abilityNameHash_;
                result.abilityOverrideNameHash_ = abilityOverrideNameHash_;
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
                if (other instanceof emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo) {
                    return mergeFrom((emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo other) {
                if (other
                        == emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo.getDefaultInstance())
                    return this;
                if (other.getAbilityId() != 0) {
                    setAbilityId(other.getAbilityId());
                }
                if (other.getAbilityNameHash() != 0) {
                    setAbilityNameHash(other.getAbilityNameHash());
                }
                if (other.getAbilityOverrideNameHash() != 0) {
                    setAbilityOverrideNameHash(other.getAbilityOverrideNameHash());
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
                emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int abilityId_;
            /**
             * <code>uint32 ability_id = 1;</code>
             *
             * @return The abilityId.
             */
            @java.lang.Override
            public int getAbilityId() {
                return abilityId_;
            }
            /**
             * <code>uint32 ability_id = 1;</code>
             *
             * @param value The abilityId to set.
             * @return This builder for chaining.
             */
            public Builder setAbilityId(int value) {

                abilityId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 ability_id = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearAbilityId() {

                abilityId_ = 0;
                onChanged();
                return this;
            }

            private int abilityNameHash_;
            /**
             * <code>fixed32 ability_name_hash = 2;</code>
             *
             * @return The abilityNameHash.
             */
            @java.lang.Override
            public int getAbilityNameHash() {
                return abilityNameHash_;
            }
            /**
             * <code>fixed32 ability_name_hash = 2;</code>
             *
             * @param value The abilityNameHash to set.
             * @return This builder for chaining.
             */
            public Builder setAbilityNameHash(int value) {

                abilityNameHash_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>fixed32 ability_name_hash = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearAbilityNameHash() {

                abilityNameHash_ = 0;
                onChanged();
                return this;
            }

            private int abilityOverrideNameHash_;
            /**
             * <code>fixed32 ability_override_name_hash = 3;</code>
             *
             * @return The abilityOverrideNameHash.
             */
            @java.lang.Override
            public int getAbilityOverrideNameHash() {
                return abilityOverrideNameHash_;
            }
            /**
             * <code>fixed32 ability_override_name_hash = 3;</code>
             *
             * @param value The abilityOverrideNameHash to set.
             * @return This builder for chaining.
             */
            public Builder setAbilityOverrideNameHash(int value) {

                abilityOverrideNameHash_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>fixed32 ability_override_name_hash = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearAbilityOverrideNameHash() {

                abilityOverrideNameHash_ = 0;
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

            // @@protoc_insertion_point(builder_scope:AbilityEmbryo)
        }

        // @@protoc_insertion_point(class_scope:AbilityEmbryo)
        private static final emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo();
        }

        public static emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<AbilityEmbryo> PARSER =
                new com.google.protobuf.AbstractParser<AbilityEmbryo>() {
                    @java.lang.Override
                    public AbilityEmbryo parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new AbilityEmbryo(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<AbilityEmbryo> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<AbilityEmbryo> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_AbilityEmbryo_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_AbilityEmbryo_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\023AbilityEmbryo.proto\"b\n\rAbilityEmbryo\022\022"
                    + "\n\nability_id\030\001 \001(\r\022\031\n\021ability_name_hash\030"
                    + "\002 \001(\007\022\"\n\032ability_override_name_hash\030\003 \001("
                    + "\007B\033\n\031emu.grasscutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_AbilityEmbryo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AbilityEmbryo_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_AbilityEmbryo_descriptor,
                        new java.lang.String[] {
                            "AbilityId", "AbilityNameHash", "AbilityOverrideNameHash",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
