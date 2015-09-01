package br.com.keyrus.storefront.controllers.pages.checkout.single;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractCheckoutController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.keyrus.controllers.ControllerConstants;


/**
 * SinglePageCheckoutController
 */
@Controller
@RequestMapping(value = "/checkout/single")
public class SinglePageCheckoutController extends AbstractCheckoutController
{
	protected static final Logger LOG = Logger.getLogger(SinglePageCheckoutController.class);

	protected static final String SINGLE_PAGE_CHECKOUT_SUMMARY_CMS_PAGE_LABEL = "singlePageCheckoutSummary";
	private final static String SINGLE = "single";


	@RequestMapping(method = RequestMethod.GET)
	public String summary(final Model model, final RedirectAttributes redirectAttributes) throws CMSItemNotFoundException
	{
		storeCmsPageInModel(model, getContentPageForLabelOrId(SINGLE_PAGE_CHECKOUT_SUMMARY_CMS_PAGE_LABEL));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(SINGLE_PAGE_CHECKOUT_SUMMARY_CMS_PAGE_LABEL));
		/*
		 * model.addAttribute(WebConstants.BREADCRUMBS_KEY,
		 * getResourceBreadcrumbBuilder().getBreadcrumbs("checkout.multi.summary.breadcrumb"));
		 */
		model.addAttribute("metaRobots", "noindex,nofollow");
		return ControllerConstants.Views.Pages.SinglePageCheckout.CheckoutSummaryPage;
	}

}
