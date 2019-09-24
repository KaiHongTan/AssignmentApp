package com.panaceasoft.psbuyandsell.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.panaceasoft.psbuyandsell.db.common.Converters;
import com.panaceasoft.psbuyandsell.viewobject.AboutUs;
import com.panaceasoft.psbuyandsell.viewobject.Blog;
import com.panaceasoft.psbuyandsell.viewobject.ChatHistory;
import com.panaceasoft.psbuyandsell.viewobject.ChatHistoryMap;
import com.panaceasoft.psbuyandsell.viewobject.City;
import com.panaceasoft.psbuyandsell.viewobject.CityMap;
import com.panaceasoft.psbuyandsell.viewobject.Comment;
import com.panaceasoft.psbuyandsell.viewobject.CommentDetail;
import com.panaceasoft.psbuyandsell.viewobject.DeletedObject;
import com.panaceasoft.psbuyandsell.viewobject.Image;
import com.panaceasoft.psbuyandsell.viewobject.Item;
import com.panaceasoft.psbuyandsell.viewobject.ItemCategory;
import com.panaceasoft.psbuyandsell.viewobject.ItemCollection;
import com.panaceasoft.psbuyandsell.viewobject.ItemCollectionHeader;
import com.panaceasoft.psbuyandsell.viewobject.ItemCondition;
import com.panaceasoft.psbuyandsell.viewobject.ItemCurrency;
import com.panaceasoft.psbuyandsell.viewobject.ItemDealOption;
import com.panaceasoft.psbuyandsell.viewobject.ItemFavourite;
import com.panaceasoft.psbuyandsell.viewobject.ItemFromFollower;
import com.panaceasoft.psbuyandsell.viewobject.ItemHistory;
import com.panaceasoft.psbuyandsell.viewobject.ItemLocation;
import com.panaceasoft.psbuyandsell.viewobject.ItemMap;
import com.panaceasoft.psbuyandsell.viewobject.ItemPriceType;
import com.panaceasoft.psbuyandsell.viewobject.ItemSpecs;
import com.panaceasoft.psbuyandsell.viewobject.ItemSubCategory;
import com.panaceasoft.psbuyandsell.viewobject.ItemType;
import com.panaceasoft.psbuyandsell.viewobject.Noti;
import com.panaceasoft.psbuyandsell.viewobject.PSAppInfo;
import com.panaceasoft.psbuyandsell.viewobject.PSAppSetting;
import com.panaceasoft.psbuyandsell.viewobject.PSAppVersion;
import com.panaceasoft.psbuyandsell.viewobject.Rating;
import com.panaceasoft.psbuyandsell.viewobject.User;
import com.panaceasoft.psbuyandsell.viewobject.UserLogin;
import com.panaceasoft.psbuyandsell.viewobject.UserMap;
import com.panaceasoft.psbuyandsell.viewobject.messageHolder.Message;


/**
 * Created by Panacea-Soft on 11/20/17.
 * Contact Email : teamps.is.cool@gmail.com
 */

@Database(entities = {
        Image.class,
        User.class,
        UserLogin.class,
        AboutUs.class,
        ItemFavourite.class,
        Comment.class,
        CommentDetail.class,
        Noti.class,
        ItemHistory.class,
        Blog.class,
        Rating.class,
        PSAppInfo.class,
        PSAppVersion.class,
        DeletedObject.class,
        City.class,
        CityMap.class,
        Item.class,
        ItemMap.class,
        ItemCategory.class,
        ItemCollectionHeader.class,
        ItemCollection.class,
        ItemSubCategory.class,
        ItemSpecs.class,
        ItemCurrency.class,
        ItemPriceType.class,
        ItemType.class,
        ItemLocation.class,
        ItemDealOption.class,
        ItemCondition.class,
        ItemFromFollower.class,
        Message.class,
        ChatHistory.class,
        ChatHistoryMap.class,
        PSAppSetting.class,
        UserMap.class


}, version = 1, exportSchema = false)

@TypeConverters({Converters.class})

public abstract class PSCoreDb extends RoomDatabase {

    abstract public UserDao userDao();

    abstract public UserMapDao userMapDao();

    abstract public HistoryDao historyDao();

    abstract public SpecsDao specsDao();

    abstract public AboutUsDao aboutUsDao();

    abstract public ImageDao imageDao();

    abstract public ItemDealOptionDao itemDealOptionDao();

    abstract public ItemConditionDao itemConditionDao();

    abstract public ItemLocationDao itemLocationDao();

    abstract public ItemCurrencyDao itemCurrencyDao();

    abstract public ItemPriceTypeDao itemPriceTypeDao();

    abstract public ItemTypeDao itemTypeDao();

    abstract public RatingDao ratingDao();

    abstract public CommentDao commentDao();

    abstract public CommentDetailDao commentDetailDao();

    abstract public NotificationDao notificationDao();

    abstract public BlogDao blogDao();

    abstract public PSAppInfoDao psAppInfoDao();

    abstract public PSAppVersionDao psAppVersionDao();

    abstract public DeletedObjectDao deletedObjectDao();

    abstract public CityDao cityDao();

    abstract public CityMapDao cityMapDao();

    abstract public ItemDao itemDao();

    abstract public ItemMapDao itemMapDao();

    abstract public ItemCategoryDao itemCategoryDao();

    abstract public ItemCollectionHeaderDao itemCollectionHeaderDao();

    abstract public ItemSubCategoryDao itemSubCategoryDao();

    abstract public ChatHistoryDao chatHistoryDao();

    abstract public MessageDao messageDao();



//    /**
//     * Migrate from:
//     * version 1 - using Room
//     * to
//     * version 2 - using Room where the {@link } has an extra field: addedDateStr
//     */
//    public static final Migration MIGRATION_1_2 = new Migration(1, 2) {
//        @Override
//        public void migrate(@NonNull SupportSQLiteDatabase database) {
//            database.execSQL("ALTER TABLE news "
//                    + " ADD COLUMN addedDateStr INTEGER NOT NULL DEFAULT 0");
//        }
//    };

    /* More migration write here */
}