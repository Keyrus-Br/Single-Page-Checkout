/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2015 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package br.com.keyrus.controllers;

/**
 */
public interface ControllerConstants
{
	String ADDON_PREFIX = "addon:/b2csinglepagecheckoutaddon/";

	/**
	 * Class with view name constants
	 */
	interface Views
	{

		interface Pages
		{

			interface SinglePageCheckout
			{
				String CheckoutSummaryPage = ADDON_PREFIX + "pages/checkout/single/checkoutSummaryPage";
			}
		}

		interface Fragments
		{

			interface Checkout
			{
				String TermsAndConditionsPopup = ADDON_PREFIX + "fragments/checkout/termsAndConditionsPopup";
				String BillingAddressForm = ADDON_PREFIX + "fragments/checkout/billingAddressForm";
			}

		}
	}
}
