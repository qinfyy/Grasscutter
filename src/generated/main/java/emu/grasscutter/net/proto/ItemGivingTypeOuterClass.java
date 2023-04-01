// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ItemGivingType.proto

package emu.grasscutter.net.proto;

public final class ItemGivingTypeOuterClass {
    private ItemGivingTypeOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }
    /** Protobuf enum {@code ItemGivingType} */
    public enum ItemGivingType implements com.google.protobuf.ProtocolMessageEnum {
        /**
         *
         *
         * <pre>
         * ??
         * </pre>
         *
         * <code>ITEM_GIVING_TYPE_NONE = 0;</code>
         */
        ITEM_GIVING_TYPE_NONE(0),
        /** <code>ITEM_GIVING_TYPE_GADGET = 1;</code> */
        ITEM_GIVING_TYPE_GADGET(1),
        UNRECOGNIZED(-1),
        ;

        /**
         *
         *
         * <pre>
         * ??
         * </pre>
         *
         * <code>ITEM_GIVING_TYPE_NONE = 0;</code>
         */
        public static final int ITEM_GIVING_TYPE_NONE_VALUE = 0;
        /** <code>ITEM_GIVING_TYPE_GADGET = 1;</code> */
        public static final int ITEM_GIVING_TYPE_GADGET_VALUE = 1;

        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new java.lang.IllegalArgumentException(
                        "Can't get the number of an unknown enum value.");
            }
            return value;
        }

        /**
         * @param value The numeric wire value of the corresponding enum entry.
         * @return The enum associated with the given numeric wire value.
         * @deprecated Use {@link #forNumber(int)} instead.
         */
        @java.lang.Deprecated
        public static ItemGivingType valueOf(int value) {
            return forNumber(value);
        }

        /**
         * @param value The numeric wire value of the corresponding enum entry.
         * @return The enum associated with the given numeric wire value.
         */
        public static ItemGivingType forNumber(int value) {
            switch (value) {
                case 0:
                    return ITEM_GIVING_TYPE_NONE;
                case 1:
                    return ITEM_GIVING_TYPE_GADGET;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<ItemGivingType> internalGetValueMap() {
            return internalValueMap;
        }

        private static final com.google.protobuf.Internal.EnumLiteMap<ItemGivingType> internalValueMap =
                new com.google.protobuf.Internal.EnumLiteMap<ItemGivingType>() {
                    public ItemGivingType findValueByNumber(int number) {
                        return ItemGivingType.forNumber(number);
                    }
                };

        public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == UNRECOGNIZED) {
                throw new java.lang.IllegalStateException(
                        "Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(ordinal());
        }

        public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
            return emu.grasscutter.net.proto.ItemGivingTypeOuterClass.getDescriptor()
                    .getEnumTypes()
                    .get(0);
        }

        private static final ItemGivingType[] VALUES = values();

        public static ItemGivingType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[desc.getIndex()];
        }

        private final int value;

        private ItemGivingType(int value) {
            this.value = value;
        }

        // @@protoc_insertion_point(enum_scope:ItemGivingType)
    }

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\024ItemGivingType.proto*H\n\016ItemGivingType"
                    + "\022\031\n\025ITEM_GIVING_TYPE_NONE\020\000\022\033\n\027ITEM_GIVI"
                    + "NG_TYPE_GADGET\020\001B\033\n\031emu.grasscutter.net."
                    + "protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    }

    // @@protoc_insertion_point(outer_class_scope)
}
