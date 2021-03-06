/*
 * Copyright (C) guolin, Suzhou Quxiang Inc. Open source codes for study only.
 * Do not use for commercial purpose.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.quxianggif.network.model

import com.google.gson.annotations.SerializedName
import com.quxianggif.network.request.ModifyUserInfoRequest

/**
 * 修改用户信息请求的实体类封装。
 *
 * @author guolin
 * @since 17/10/29
 */
class ModifyUserInfo : Response() {

    /**
     * 当前登录用户的昵称。
     */
    var nickname: String = ""

    /**
     * 当前登录用户的个人简介。
     */
    @SerializedName("desp")
    var description: String = ""

    /**
     * 当前登录用户的头像。
     */
    var avatar: String = ""

    /**
     * 当前登录的个人主页背景图。
     */
    @SerializedName("bg")
    var bgImage: String = ""

    companion object {

        fun getResponse(nickname: String, description: String, avatarFilePath: String,
                        bgImageFilePath: String, callback: Callback) {
            ModifyUserInfoRequest()
                    .nickname(nickname)
                    .description(description)
                    .avatarFilePath(avatarFilePath)
                    .bgImageFilePath(bgImageFilePath)
                    .listen(callback)
        }
    }

}