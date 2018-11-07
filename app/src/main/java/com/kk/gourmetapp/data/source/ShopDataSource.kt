package com.kk.gourmetapp.data.source

import com.android.volley.toolbox.ImageLoader
import com.kk.gourmetapp.data.GurunaviShop

interface ShopDataSource {

    // ぐるなびAPIからデータ取得完了コールバック
    interface CreateGurunaviShopCallback {

        /**
         * ぐるなびAPIからEntity作成完了時に呼ばれるコールバック
         * @param shops お店情報リスト
         * @param imageLoader お店の画像用イメージローダー
         */
        fun createdShop(shops: MutableList<GurunaviShop>, imageLoader: ImageLoader?)
    }

    /**
     * ぐるなびからお店情報を生成する処理
     * @param callback 情報取得後のコールバック
     */
    fun createGurunaviInfo(callback: CreateGurunaviShopCallback)
}