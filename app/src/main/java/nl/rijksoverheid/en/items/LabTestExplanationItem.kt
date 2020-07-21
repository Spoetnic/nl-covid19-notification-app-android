/*
 * Copyright (c) 2020 De Staat der Nederlanden, Ministerie van Volksgezondheid, Welzijn en Sport.
 *  Licensed under the EUROPEAN UNION PUBLIC LICENCE v. 1.2
 *
 *  SPDX-License-Identifier: EUPL-1.2
 */
package nl.rijksoverheid.en.items

import androidx.annotation.StringRes

class LabTestExplanationItem(
    @StringRes private val text: Int,
    vararg formatArgs: Any
) : ParagraphItem(text, formatArgs) {
    override fun isClickable() = true
}
