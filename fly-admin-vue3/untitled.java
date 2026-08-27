public class RoomCategory extends BaseEntity {
    private String categoryId;    // 分类ID（UUID主键）
    private String name;          // 名称
    private String description;   // 描述
    private BigDecimal price;     // 单晚价格
    private String image;         // 图片
}
