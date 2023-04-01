// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GachaUpInfo.proto

package emu.grasscutter.net.proto;

public final class GachaUpInfoOuterClass {
    private GachaUpInfoOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface GachaUpInfoOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:GachaUpInfo)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 item_parent_type = 9;</code>
         *
         * @return The itemParentType.
         */
        int getItemParentType();

        /**
         * <code>repeated uint32 item_id_list = 7;</code>
         *
         * @return A list containing the itemIdList.
         */
        java.util.List<java.lang.Integer> getItemIdListList();
        /**
         * <code>repeated uint32 item_id_list = 7;</code>
         *
         * @return The count of itemIdList.
         */
        int getItemIdListCount();
        /**
         * <code>repeated uint32 item_id_list = 7;</code>
         *
         * @param index The index of the element to return.
         * @return The itemIdList at the given index.
         */
        int getItemIdList(int index);
    }
    /**
     *
     *
     * <pre>
     * Name: AFPNKHJMJLE
     * </pre>
     *
     * Protobuf type {@code GachaUpInfo}
     */
    public static final class GachaUpInfo extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:GachaUpInfo)
            GachaUpInfoOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use GachaUpInfo.newBuilder() to construct.
        private GachaUpInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private GachaUpInfo() {
            itemIdList_ = emptyIntList();
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new GachaUpInfo();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GachaUpInfo(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            int mutable_bitField0_ = 0;
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
                        case 56:
                            {
                                if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                    itemIdList_ = newIntList();
                                    mutable_bitField0_ |= 0x00000001;
                                }
                                itemIdList_.addInt(input.readUInt32());
                                break;
                            }
                        case 58:
                            {
                                int length = input.readRawVarint32();
                                int limit = input.pushLimit(length);
                                if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                                    itemIdList_ = newIntList();
                                    mutable_bitField0_ |= 0x00000001;
                                }
                                while (input.getBytesUntilLimit() > 0) {
                                    itemIdList_.addInt(input.readUInt32());
                                }
                                input.popLimit(limit);
                                break;
                            }
                        case 72:
                            {
                                itemParentType_ = input.readUInt32();
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
                if (((mutable_bitField0_ & 0x00000001) != 0)) {
                    itemIdList_.makeImmutable(); // C
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return emu.grasscutter.net.proto.GachaUpInfoOuterClass.internal_static_GachaUpInfo_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.GachaUpInfoOuterClass
                    .internal_static_GachaUpInfo_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo.class,
                            emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo.Builder.class);
        }

        public static final int ITEM_PARENT_TYPE_FIELD_NUMBER = 9;
        private int itemParentType_;
        /**
         * <code>uint32 item_parent_type = 9;</code>
         *
         * @return The itemParentType.
         */
        @java.lang.Override
        public int getItemParentType() {
            return itemParentType_;
        }

        public static final int ITEM_ID_LIST_FIELD_NUMBER = 7;
        private com.google.protobuf.Internal.IntList itemIdList_;
        /**
         * <code>repeated uint32 item_id_list = 7;</code>
         *
         * @return A list containing the itemIdList.
         */
        @java.lang.Override
        public java.util.List<java.lang.Integer> getItemIdListList() {
            return itemIdList_;
        }
        /**
         * <code>repeated uint32 item_id_list = 7;</code>
         *
         * @return The count of itemIdList.
         */
        public int getItemIdListCount() {
            return itemIdList_.size();
        }
        /**
         * <code>repeated uint32 item_id_list = 7;</code>
         *
         * @param index The index of the element to return.
         * @return The itemIdList at the given index.
         */
        public int getItemIdList(int index) {
            return itemIdList_.getInt(index);
        }

        private int itemIdListMemoizedSerializedSize = -1;

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
            getSerializedSize();
            if (getItemIdListList().size() > 0) {
                output.writeUInt32NoTag(58);
                output.writeUInt32NoTag(itemIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < itemIdList_.size(); i++) {
                output.writeUInt32NoTag(itemIdList_.getInt(i));
            }
            if (itemParentType_ != 0) {
                output.writeUInt32(9, itemParentType_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            {
                int dataSize = 0;
                for (int i = 0; i < itemIdList_.size(); i++) {
                    dataSize +=
                            com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(itemIdList_.getInt(i));
                }
                size += dataSize;
                if (!getItemIdListList().isEmpty()) {
                    size += 1;
                    size += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(dataSize);
                }
                itemIdListMemoizedSerializedSize = dataSize;
            }
            if (itemParentType_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(9, itemParentType_);
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
            if (!(obj instanceof emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo other =
                    (emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo) obj;

            if (getItemParentType() != other.getItemParentType()) return false;
            if (!getItemIdListList().equals(other.getItemIdListList())) return false;
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
            hash = (37 * hash) + ITEM_PARENT_TYPE_FIELD_NUMBER;
            hash = (53 * hash) + getItemParentType();
            if (getItemIdListCount() > 0) {
                hash = (37 * hash) + ITEM_ID_LIST_FIELD_NUMBER;
                hash = (53 * hash) + getItemIdListList().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo parseDelimitedFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo parseDelimitedFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo parseFrom(
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
                emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo prototype) {
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
         * Name: AFPNKHJMJLE
         * </pre>
         *
         * Protobuf type {@code GachaUpInfo}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:GachaUpInfo)
                emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfoOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.GachaUpInfoOuterClass
                        .internal_static_GachaUpInfo_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.GachaUpInfoOuterClass
                        .internal_static_GachaUpInfo_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo.class,
                                emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo.Builder.class);
            }

            // Construct using emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo.newBuilder()
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
                itemParentType_ = 0;

                itemIdList_ = emptyIntList();
                bitField0_ = (bitField0_ & ~0x00000001);
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.GachaUpInfoOuterClass
                        .internal_static_GachaUpInfo_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo build() {
                emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo buildPartial() {
                emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo result =
                        new emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo(this);
                int from_bitField0_ = bitField0_;
                result.itemParentType_ = itemParentType_;
                if (((bitField0_ & 0x00000001) != 0)) {
                    itemIdList_.makeImmutable();
                    bitField0_ = (bitField0_ & ~0x00000001);
                }
                result.itemIdList_ = itemIdList_;
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
                if (other instanceof emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo) {
                    return mergeFrom((emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo other) {
                if (other
                        == emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo.getDefaultInstance())
                    return this;
                if (other.getItemParentType() != 0) {
                    setItemParentType(other.getItemParentType());
                }
                if (!other.itemIdList_.isEmpty()) {
                    if (itemIdList_.isEmpty()) {
                        itemIdList_ = other.itemIdList_;
                        bitField0_ = (bitField0_ & ~0x00000001);
                    } else {
                        ensureItemIdListIsMutable();
                        itemIdList_.addAll(other.itemIdList_);
                    }
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
                emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int bitField0_;

            private int itemParentType_;
            /**
             * <code>uint32 item_parent_type = 9;</code>
             *
             * @return The itemParentType.
             */
            @java.lang.Override
            public int getItemParentType() {
                return itemParentType_;
            }
            /**
             * <code>uint32 item_parent_type = 9;</code>
             *
             * @param value The itemParentType to set.
             * @return This builder for chaining.
             */
            public Builder setItemParentType(int value) {

                itemParentType_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 item_parent_type = 9;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearItemParentType() {

                itemParentType_ = 0;
                onChanged();
                return this;
            }

            private com.google.protobuf.Internal.IntList itemIdList_ = emptyIntList();

            private void ensureItemIdListIsMutable() {
                if (!((bitField0_ & 0x00000001) != 0)) {
                    itemIdList_ = mutableCopy(itemIdList_);
                    bitField0_ |= 0x00000001;
                }
            }
            /**
             * <code>repeated uint32 item_id_list = 7;</code>
             *
             * @return A list containing the itemIdList.
             */
            public java.util.List<java.lang.Integer> getItemIdListList() {
                return ((bitField0_ & 0x00000001) != 0)
                        ? java.util.Collections.unmodifiableList(itemIdList_)
                        : itemIdList_;
            }
            /**
             * <code>repeated uint32 item_id_list = 7;</code>
             *
             * @return The count of itemIdList.
             */
            public int getItemIdListCount() {
                return itemIdList_.size();
            }
            /**
             * <code>repeated uint32 item_id_list = 7;</code>
             *
             * @param index The index of the element to return.
             * @return The itemIdList at the given index.
             */
            public int getItemIdList(int index) {
                return itemIdList_.getInt(index);
            }
            /**
             * <code>repeated uint32 item_id_list = 7;</code>
             *
             * @param index The index to set the value at.
             * @param value The itemIdList to set.
             * @return This builder for chaining.
             */
            public Builder setItemIdList(int index, int value) {
                ensureItemIdListIsMutable();
                itemIdList_.setInt(index, value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 item_id_list = 7;</code>
             *
             * @param value The itemIdList to add.
             * @return This builder for chaining.
             */
            public Builder addItemIdList(int value) {
                ensureItemIdListIsMutable();
                itemIdList_.addInt(value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 item_id_list = 7;</code>
             *
             * @param values The itemIdList to add.
             * @return This builder for chaining.
             */
            public Builder addAllItemIdList(java.lang.Iterable<? extends java.lang.Integer> values) {
                ensureItemIdListIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(values, itemIdList_);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 item_id_list = 7;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearItemIdList() {
                itemIdList_ = emptyIntList();
                bitField0_ = (bitField0_ & ~0x00000001);
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

            // @@protoc_insertion_point(builder_scope:GachaUpInfo)
        }

        // @@protoc_insertion_point(class_scope:GachaUpInfo)
        private static final emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo();
        }

        public static emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<GachaUpInfo> PARSER =
                new com.google.protobuf.AbstractParser<GachaUpInfo>() {
                    @java.lang.Override
                    public GachaUpInfo parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new GachaUpInfo(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<GachaUpInfo> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<GachaUpInfo> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.GachaUpInfoOuterClass.GachaUpInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_GachaUpInfo_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_GachaUpInfo_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\021GachaUpInfo.proto\"=\n\013GachaUpInfo\022\030\n\020it"
                    + "em_parent_type\030\t \001(\r\022\024\n\014item_id_list\030\007 \003"
                    + "(\rB\033\n\031emu.grasscutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_GachaUpInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GachaUpInfo_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_GachaUpInfo_descriptor,
                        new java.lang.String[] {
                            "ItemParentType", "ItemIdList",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
