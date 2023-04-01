// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ItemCdGroupTimeNotify.proto

package emu.grasscutter.net.proto;

public final class ItemCdGroupTimeNotifyOuterClass {
    private ItemCdGroupTimeNotifyOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface ItemCdGroupTimeNotifyOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:ItemCdGroupTimeNotify)
            com.google.protobuf.MessageOrBuilder {

        /** <code>map&lt;uint32, uint64&gt; item_cd_map = 3;</code> */
        int getItemCdMapCount();
        /** <code>map&lt;uint32, uint64&gt; item_cd_map = 3;</code> */
        boolean containsItemCdMap(int key);
        /** Use {@link #getItemCdMapMap()} instead. */
        @java.lang.Deprecated
        java.util.Map<java.lang.Integer, java.lang.Long> getItemCdMap();
        /** <code>map&lt;uint32, uint64&gt; item_cd_map = 3;</code> */
        java.util.Map<java.lang.Integer, java.lang.Long> getItemCdMapMap();
        /** <code>map&lt;uint32, uint64&gt; item_cd_map = 3;</code> */
        long getItemCdMapOrDefault(int key, long defaultValue);
        /** <code>map&lt;uint32, uint64&gt; item_cd_map = 3;</code> */
        long getItemCdMapOrThrow(int key);
    }
    /**
     *
     *
     * <pre>
     * Name: KBFIFLBFIII
     * CmdId: 626
     * </pre>
     *
     * Protobuf type {@code ItemCdGroupTimeNotify}
     */
    public static final class ItemCdGroupTimeNotify extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:ItemCdGroupTimeNotify)
            ItemCdGroupTimeNotifyOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use ItemCdGroupTimeNotify.newBuilder() to construct.
        private ItemCdGroupTimeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private ItemCdGroupTimeNotify() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new ItemCdGroupTimeNotify();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ItemCdGroupTimeNotify(
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
                        case 26:
                            {
                                if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                    itemCdMap_ =
                                            com.google.protobuf.MapField.newMapField(
                                                    ItemCdMapDefaultEntryHolder.defaultEntry);
                                    mutable_bitField0_ |= 0x00000001;
                                }
                                com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Long> itemCdMap__ =
                                        input.readMessage(
                                                ItemCdMapDefaultEntryHolder.defaultEntry.getParserForType(),
                                                extensionRegistry);
                                itemCdMap_.getMutableMap().put(itemCdMap__.getKey(), itemCdMap__.getValue());
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
            return emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass
                    .internal_static_ItemCdGroupTimeNotify_descriptor;
        }

        @SuppressWarnings({"rawtypes"})
        @java.lang.Override
        protected com.google.protobuf.MapField internalGetMapField(int number) {
            switch (number) {
                case 3:
                    return internalGetItemCdMap();
                default:
                    throw new RuntimeException("Invalid map field number: " + number);
            }
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass
                    .internal_static_ItemCdGroupTimeNotify_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify.class,
                            emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify
                                    .Builder.class);
        }

        public static final int ITEM_CD_MAP_FIELD_NUMBER = 3;

        private static final class ItemCdMapDefaultEntryHolder {
            static final com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Long> defaultEntry =
                    com.google.protobuf.MapEntry.<java.lang.Integer, java.lang.Long>newDefaultInstance(
                            emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass
                                    .internal_static_ItemCdGroupTimeNotify_ItemCdMapEntry_descriptor,
                            com.google.protobuf.WireFormat.FieldType.UINT32,
                            0,
                            com.google.protobuf.WireFormat.FieldType.UINT64,
                            0L);
        }

        private com.google.protobuf.MapField<java.lang.Integer, java.lang.Long> itemCdMap_;

        private com.google.protobuf.MapField<java.lang.Integer, java.lang.Long> internalGetItemCdMap() {
            if (itemCdMap_ == null) {
                return com.google.protobuf.MapField.emptyMapField(ItemCdMapDefaultEntryHolder.defaultEntry);
            }
            return itemCdMap_;
        }

        public int getItemCdMapCount() {
            return internalGetItemCdMap().getMap().size();
        }
        /** <code>map&lt;uint32, uint64&gt; item_cd_map = 3;</code> */
        @java.lang.Override
        public boolean containsItemCdMap(int key) {

            return internalGetItemCdMap().getMap().containsKey(key);
        }
        /** Use {@link #getItemCdMapMap()} instead. */
        @java.lang.Override
        @java.lang.Deprecated
        public java.util.Map<java.lang.Integer, java.lang.Long> getItemCdMap() {
            return getItemCdMapMap();
        }
        /** <code>map&lt;uint32, uint64&gt; item_cd_map = 3;</code> */
        @java.lang.Override
        public java.util.Map<java.lang.Integer, java.lang.Long> getItemCdMapMap() {
            return internalGetItemCdMap().getMap();
        }
        /** <code>map&lt;uint32, uint64&gt; item_cd_map = 3;</code> */
        @java.lang.Override
        public long getItemCdMapOrDefault(int key, long defaultValue) {

            java.util.Map<java.lang.Integer, java.lang.Long> map = internalGetItemCdMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        /** <code>map&lt;uint32, uint64&gt; item_cd_map = 3;</code> */
        @java.lang.Override
        public long getItemCdMapOrThrow(int key) {

            java.util.Map<java.lang.Integer, java.lang.Long> map = internalGetItemCdMap().getMap();
            if (!map.containsKey(key)) {
                throw new java.lang.IllegalArgumentException();
            }
            return map.get(key);
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
            com.google.protobuf.GeneratedMessageV3.serializeIntegerMapTo(
                    output, internalGetItemCdMap(), ItemCdMapDefaultEntryHolder.defaultEntry, 3);
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            for (java.util.Map.Entry<java.lang.Integer, java.lang.Long> entry :
                    internalGetItemCdMap().getMap().entrySet()) {
                com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Long> itemCdMap__ =
                        ItemCdMapDefaultEntryHolder.defaultEntry
                                .newBuilderForType()
                                .setKey(entry.getKey())
                                .setValue(entry.getValue())
                                .build();
                size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, itemCdMap__);
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
                    emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify other =
                    (emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify) obj;

            if (!internalGetItemCdMap().equals(other.internalGetItemCdMap())) return false;
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
            if (!internalGetItemCdMap().getMap().isEmpty()) {
                hash = (37 * hash) + ITEM_CD_MAP_FIELD_NUMBER;
                hash = (53 * hash) + internalGetItemCdMap().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify
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
                emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify prototype) {
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
         * Name: KBFIFLBFIII
         * CmdId: 626
         * </pre>
         *
         * Protobuf type {@code ItemCdGroupTimeNotify}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:ItemCdGroupTimeNotify)
                emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotifyOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass
                        .internal_static_ItemCdGroupTimeNotify_descriptor;
            }

            @SuppressWarnings({"rawtypes"})
            protected com.google.protobuf.MapField internalGetMapField(int number) {
                switch (number) {
                    case 3:
                        return internalGetItemCdMap();
                    default:
                        throw new RuntimeException("Invalid map field number: " + number);
                }
            }

            @SuppressWarnings({"rawtypes"})
            protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
                switch (number) {
                    case 3:
                        return internalGetMutableItemCdMap();
                    default:
                        throw new RuntimeException("Invalid map field number: " + number);
                }
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass
                        .internal_static_ItemCdGroupTimeNotify_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify
                                        .class,
                                emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify
                                        .Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify.newBuilder()
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
                internalGetMutableItemCdMap().clear();
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass
                        .internal_static_ItemCdGroupTimeNotify_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify
                    build() {
                emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify
                    buildPartial() {
                emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify result =
                        new emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify(
                                this);
                int from_bitField0_ = bitField0_;
                result.itemCdMap_ = internalGetItemCdMap();
                result.itemCdMap_.makeImmutable();
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
                        emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify other) {
                if (other
                        == emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify
                                .getDefaultInstance()) return this;
                internalGetMutableItemCdMap().mergeFrom(other.internalGetItemCdMap());
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
                emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify)
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

            private com.google.protobuf.MapField<java.lang.Integer, java.lang.Long> itemCdMap_;

            private com.google.protobuf.MapField<java.lang.Integer, java.lang.Long>
                    internalGetItemCdMap() {
                if (itemCdMap_ == null) {
                    return com.google.protobuf.MapField.emptyMapField(
                            ItemCdMapDefaultEntryHolder.defaultEntry);
                }
                return itemCdMap_;
            }

            private com.google.protobuf.MapField<java.lang.Integer, java.lang.Long>
                    internalGetMutableItemCdMap() {
                onChanged();
                ;
                if (itemCdMap_ == null) {
                    itemCdMap_ =
                            com.google.protobuf.MapField.newMapField(ItemCdMapDefaultEntryHolder.defaultEntry);
                }
                if (!itemCdMap_.isMutable()) {
                    itemCdMap_ = itemCdMap_.copy();
                }
                return itemCdMap_;
            }

            public int getItemCdMapCount() {
                return internalGetItemCdMap().getMap().size();
            }
            /** <code>map&lt;uint32, uint64&gt; item_cd_map = 3;</code> */
            @java.lang.Override
            public boolean containsItemCdMap(int key) {

                return internalGetItemCdMap().getMap().containsKey(key);
            }
            /** Use {@link #getItemCdMapMap()} instead. */
            @java.lang.Override
            @java.lang.Deprecated
            public java.util.Map<java.lang.Integer, java.lang.Long> getItemCdMap() {
                return getItemCdMapMap();
            }
            /** <code>map&lt;uint32, uint64&gt; item_cd_map = 3;</code> */
            @java.lang.Override
            public java.util.Map<java.lang.Integer, java.lang.Long> getItemCdMapMap() {
                return internalGetItemCdMap().getMap();
            }
            /** <code>map&lt;uint32, uint64&gt; item_cd_map = 3;</code> */
            @java.lang.Override
            public long getItemCdMapOrDefault(int key, long defaultValue) {

                java.util.Map<java.lang.Integer, java.lang.Long> map = internalGetItemCdMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            /** <code>map&lt;uint32, uint64&gt; item_cd_map = 3;</code> */
            @java.lang.Override
            public long getItemCdMapOrThrow(int key) {

                java.util.Map<java.lang.Integer, java.lang.Long> map = internalGetItemCdMap().getMap();
                if (!map.containsKey(key)) {
                    throw new java.lang.IllegalArgumentException();
                }
                return map.get(key);
            }

            public Builder clearItemCdMap() {
                internalGetMutableItemCdMap().getMutableMap().clear();
                return this;
            }
            /** <code>map&lt;uint32, uint64&gt; item_cd_map = 3;</code> */
            public Builder removeItemCdMap(int key) {

                internalGetMutableItemCdMap().getMutableMap().remove(key);
                return this;
            }
            /** Use alternate mutation accessors instead. */
            @java.lang.Deprecated
            public java.util.Map<java.lang.Integer, java.lang.Long> getMutableItemCdMap() {
                return internalGetMutableItemCdMap().getMutableMap();
            }
            /** <code>map&lt;uint32, uint64&gt; item_cd_map = 3;</code> */
            public Builder putItemCdMap(int key, long value) {

                internalGetMutableItemCdMap().getMutableMap().put(key, value);
                return this;
            }
            /** <code>map&lt;uint32, uint64&gt; item_cd_map = 3;</code> */
            public Builder putAllItemCdMap(java.util.Map<java.lang.Integer, java.lang.Long> values) {
                internalGetMutableItemCdMap().getMutableMap().putAll(values);
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

            // @@protoc_insertion_point(builder_scope:ItemCdGroupTimeNotify)
        }

        // @@protoc_insertion_point(class_scope:ItemCdGroupTimeNotify)
        private static final emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass
                        .ItemCdGroupTimeNotify
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify();
        }

        public static emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<ItemCdGroupTimeNotify> PARSER =
                new com.google.protobuf.AbstractParser<ItemCdGroupTimeNotify>() {
                    @java.lang.Override
                    public ItemCdGroupTimeNotify parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new ItemCdGroupTimeNotify(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<ItemCdGroupTimeNotify> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<ItemCdGroupTimeNotify> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.ItemCdGroupTimeNotifyOuterClass.ItemCdGroupTimeNotify
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_ItemCdGroupTimeNotify_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_ItemCdGroupTimeNotify_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_ItemCdGroupTimeNotify_ItemCdMapEntry_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_ItemCdGroupTimeNotify_ItemCdMapEntry_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\033ItemCdGroupTimeNotify.proto\"\205\001\n\025ItemCd"
                    + "GroupTimeNotify\022:\n\013item_cd_map\030\003 \003(\0132%.I"
                    + "temCdGroupTimeNotify.ItemCdMapEntry\0320\n\016I"
                    + "temCdMapEntry\022\013\n\003key\030\001 \001(\r\022\r\n\005value\030\002 \001("
                    + "\004:\0028\001B\033\n\031emu.grasscutter.net.protob\006prot"
                    + "o3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_ItemCdGroupTimeNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ItemCdGroupTimeNotify_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_ItemCdGroupTimeNotify_descriptor,
                        new java.lang.String[] {
                            "ItemCdMap",
                        });
        internal_static_ItemCdGroupTimeNotify_ItemCdMapEntry_descriptor =
                internal_static_ItemCdGroupTimeNotify_descriptor.getNestedTypes().get(0);
        internal_static_ItemCdGroupTimeNotify_ItemCdMapEntry_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_ItemCdGroupTimeNotify_ItemCdMapEntry_descriptor,
                        new java.lang.String[] {
                            "Key", "Value",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
