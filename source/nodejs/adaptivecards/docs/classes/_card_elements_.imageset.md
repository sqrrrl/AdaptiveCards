[Adaptive Cards Javascript SDK](../README.md) › ["card-elements"](../modules/_card_elements_.md) › [ImageSet](_card_elements_.imageset.md)

# Class: ImageSet

## Hierarchy

  ↳ [CardElementContainer](_card_elements_.cardelementcontainer.md)

  ↳ **ImageSet**

## Index

### Properties

* [allowVerticalOverflow](_card_elements_.imageset.md#allowverticaloverflow)
* [customCssSelector](_card_elements_.imageset.md#customcssselector)
* [height](_card_elements_.imageset.md#height)
* [horizontalAlignment](_card_elements_.imageset.md#optional-horizontalalignment)
* [id](_card_elements_.imageset.md#id)
* [imageSize](_card_elements_.imageset.md#imagesize)
* [minPixelHeight](_card_elements_.imageset.md#optional-minpixelheight)
* [requires](_card_elements_.imageset.md#requires)
* [separator](_card_elements_.imageset.md#separator)
* [spacing](_card_elements_.imageset.md#spacing)

### Accessors

* [allowCustomPadding](_card_elements_.imageset.md#protected-allowcustompadding)
* [defaultStyle](_card_elements_.imageset.md#protected-defaultstyle)
* [hasVisibleSeparator](_card_elements_.imageset.md#hasvisibleseparator)
* [hostConfig](_card_elements_.imageset.md#hostconfig)
* [index](_card_elements_.imageset.md#index)
* [isInline](_card_elements_.imageset.md#isinline)
* [isInteractive](_card_elements_.imageset.md#isinteractive)
* [isSelectable](_card_elements_.imageset.md#protected-isselectable)
* [isStandalone](_card_elements_.imageset.md#isstandalone)
* [isVisible](_card_elements_.imageset.md#isvisible)
* [lang](_card_elements_.imageset.md#lang)
* [parent](_card_elements_.imageset.md#parent)
* [renderedElement](_card_elements_.imageset.md#renderedelement)
* [separatorElement](_card_elements_.imageset.md#separatorelement)
* [separatorOrientation](_card_elements_.imageset.md#protected-separatororientation)
* [supportsMinHeight](_card_elements_.imageset.md#protected-supportsminheight)
* [useDefaultSizing](_card_elements_.imageset.md#protected-usedefaultsizing)

### Methods

* [addImage](_card_elements_.imageset.md#addimage)
* [adjustRenderedElementSize](_card_elements_.imageset.md#protected-adjustrenderedelementsize)
* [applyPadding](_card_elements_.imageset.md#protected-applypadding)
* [asString](_card_elements_.imageset.md#asstring)
* [createPlaceholderElement](_card_elements_.imageset.md#protected-createplaceholderelement)
* [getActionAt](_card_elements_.imageset.md#getactionat)
* [getActionById](_card_elements_.imageset.md#getactionbyid)
* [getActionCount](_card_elements_.imageset.md#getactioncount)
* [getAllInputs](_card_elements_.imageset.md#getallinputs)
* [getCustomProperty](_card_elements_.imageset.md#getcustomproperty)
* [getDefaultPadding](_card_elements_.imageset.md#protected-getdefaultpadding)
* [getEffectivePadding](_card_elements_.imageset.md#geteffectivepadding)
* [getEffectiveStyle](_card_elements_.imageset.md#geteffectivestyle)
* [getElementById](_card_elements_.imageset.md#getelementbyid)
* [getFirstVisibleRenderedItem](_card_elements_.imageset.md#getfirstvisiblerendereditem)
* [getForbiddenActionTypes](_card_elements_.imageset.md#getforbiddenactiontypes)
* [getForbiddenElementTypes](_card_elements_.imageset.md#getforbiddenelementtypes)
* [getHasBackground](_card_elements_.imageset.md#protected-gethasbackground)
* [getImmediateSurroundingPadding](_card_elements_.imageset.md#getimmediatesurroundingpadding)
* [getItemAt](_card_elements_.imageset.md#getitemat)
* [getItemCount](_card_elements_.imageset.md#getitemcount)
* [getJsonTypeName](_card_elements_.imageset.md#getjsontypename)
* [getLastVisibleRenderedItem](_card_elements_.imageset.md#getlastvisiblerendereditem)
* [getPadding](_card_elements_.imageset.md#protected-getpadding)
* [getParentContainer](_card_elements_.imageset.md#getparentcontainer)
* [getResourceInformation](_card_elements_.imageset.md#getresourceinformation)
* [getRootElement](_card_elements_.imageset.md#getrootelement)
* [getSelectAction](_card_elements_.imageset.md#protected-getselectaction)
* [indexOf](_card_elements_.imageset.md#indexof)
* [internalRender](_card_elements_.imageset.md#protected-internalrender)
* [internalValidateProperties](_card_elements_.imageset.md#internalvalidateproperties)
* [isAtTheVeryBottom](_card_elements_.imageset.md#isattheverybottom)
* [isAtTheVeryLeft](_card_elements_.imageset.md#isattheveryleft)
* [isAtTheVeryRight](_card_elements_.imageset.md#isattheveryright)
* [isAtTheVeryTop](_card_elements_.imageset.md#isattheverytop)
* [isBleeding](_card_elements_.imageset.md#isbleeding)
* [isBleedingAtBottom](_card_elements_.imageset.md#isbleedingatbottom)
* [isBleedingAtTop](_card_elements_.imageset.md#isbleedingattop)
* [isBottomElement](_card_elements_.imageset.md#isbottomelement)
* [isDesignMode](_card_elements_.imageset.md#isdesignmode)
* [isElementAllowed](_card_elements_.imageset.md#protected-iselementallowed)
* [isFirstElement](_card_elements_.imageset.md#isfirstelement)
* [isHiddenDueToOverflow](_card_elements_.imageset.md#ishiddenduetooverflow)
* [isLastElement](_card_elements_.imageset.md#islastelement)
* [isLeftMostElement](_card_elements_.imageset.md#isleftmostelement)
* [isRendered](_card_elements_.imageset.md#isrendered)
* [isRightMostElement](_card_elements_.imageset.md#isrightmostelement)
* [isTopElement](_card_elements_.imageset.md#istopelement)
* [overrideInternalRender](_card_elements_.imageset.md#protected-overrideinternalrender)
* [parse](_card_elements_.imageset.md#parse)
* [remove](_card_elements_.imageset.md#remove)
* [removeItem](_card_elements_.imageset.md#removeitem)
* [render](_card_elements_.imageset.md#render)
* [setCustomProperty](_card_elements_.imageset.md#setcustomproperty)
* [setPadding](_card_elements_.imageset.md#protected-setpadding)
* [setParent](_card_elements_.imageset.md#setparent)
* [setSelectAction](_card_elements_.imageset.md#protected-setselectaction)
* [setShouldFallback](_card_elements_.imageset.md#setshouldfallback)
* [shouldFallback](_card_elements_.imageset.md#shouldfallback)
* [toJSON](_card_elements_.imageset.md#tojson)
* [truncateOverflow](_card_elements_.imageset.md#protected-truncateoverflow)
* [undoOverflowTruncation](_card_elements_.imageset.md#protected-undooverflowtruncation)
* [updateLayout](_card_elements_.imageset.md#updatelayout)
* [validateProperties](_card_elements_.imageset.md#validateproperties)

## Properties

###  allowVerticalOverflow

• **allowVerticalOverflow**: *boolean* = false

*Inherited from [CardElementContainer](_card_elements_.cardelementcontainer.md).[allowVerticalOverflow](_card_elements_.cardelementcontainer.md#allowverticaloverflow)*

___

###  customCssSelector

• **customCssSelector**: *string* = null

*Inherited from [CardElement](_card_elements_.cardelement.md).[customCssSelector](_card_elements_.cardelement.md#customcssselector)*

___

###  height

• **height**: *[CardElementHeight](../modules/_card_elements_.md#cardelementheight)* = "auto"

*Inherited from [CardElement](_card_elements_.cardelement.md).[height](_card_elements_.cardelement.md#height)*

___

### `Optional` horizontalAlignment

• **horizontalAlignment**? : *[HorizontalAlignment](../enums/_enums_.horizontalalignment.md)* = null

*Inherited from [CardElement](_card_elements_.cardelement.md).[horizontalAlignment](_card_elements_.cardelement.md#optional-horizontalalignment)*

___

###  id

• **id**: *string*

*Inherited from [CardObject](_card_elements_.cardobject.md).[id](_card_elements_.cardobject.md#id)*

___

###  imageSize

• **imageSize**: *[Size](../enums/_enums_.size.md)* = Enums.Size.Medium

___

### `Optional` minPixelHeight

• **minPixelHeight**? : *number* = null

*Inherited from [CardElement](_card_elements_.cardelement.md).[minPixelHeight](_card_elements_.cardelement.md#optional-minpixelheight)*

___

###  requires

• **requires**: *[HostCapabilities](_host_config_.hostcapabilities.md)‹›* = new HostConfig.HostCapabilities()

*Inherited from [CardElement](_card_elements_.cardelement.md).[requires](_card_elements_.cardelement.md#requires)*

___

###  separator

• **separator**: *boolean* = false

*Inherited from [CardElement](_card_elements_.cardelement.md).[separator](_card_elements_.cardelement.md#separator)*

___

###  spacing

• **spacing**: *[Spacing](../enums/_enums_.spacing.md)* = Enums.Spacing.Default

*Inherited from [CardElement](_card_elements_.cardelement.md).[spacing](_card_elements_.cardelement.md#spacing)*

## Accessors

### `Protected` allowCustomPadding

• **get allowCustomPadding**(): *boolean*

*Inherited from [CardElement](_card_elements_.cardelement.md).[allowCustomPadding](_card_elements_.cardelement.md#protected-allowcustompadding)*

**Returns:** *boolean*

___

### `Protected` defaultStyle

• **get defaultStyle**(): *string*

*Inherited from [CardElement](_card_elements_.cardelement.md).[defaultStyle](_card_elements_.cardelement.md#protected-defaultstyle)*

**Returns:** *string*

___

###  hasVisibleSeparator

• **get hasVisibleSeparator**(): *boolean*

*Inherited from [CardElement](_card_elements_.cardelement.md).[hasVisibleSeparator](_card_elements_.cardelement.md#hasvisibleseparator)*

**Returns:** *boolean*

___

###  hostConfig

• **get hostConfig**(): *[HostConfig](_host_config_.hostconfig.md)*

*Inherited from [CardElement](_card_elements_.cardelement.md).[hostConfig](_card_elements_.cardelement.md#hostconfig)*

**Returns:** *[HostConfig](_host_config_.hostconfig.md)*

• **set hostConfig**(`value`: [HostConfig](_host_config_.hostconfig.md)): *void*

*Inherited from [CardElement](_card_elements_.cardelement.md).[hostConfig](_card_elements_.cardelement.md#hostconfig)*

**Parameters:**

Name | Type |
------ | ------ |
`value` | [HostConfig](_host_config_.hostconfig.md) |

**Returns:** *void*

___

###  index

• **get index**(): *number*

*Inherited from [CardElement](_card_elements_.cardelement.md).[index](_card_elements_.cardelement.md#index)*

**Returns:** *number*

___

###  isInline

• **get isInline**(): *boolean*

*Inherited from [CardElement](_card_elements_.cardelement.md).[isInline](_card_elements_.cardelement.md#isinline)*

**Returns:** *boolean*

___

###  isInteractive

• **get isInteractive**(): *boolean*

*Inherited from [CardElement](_card_elements_.cardelement.md).[isInteractive](_card_elements_.cardelement.md#isinteractive)*

**Returns:** *boolean*

___

### `Protected` isSelectable

• **get isSelectable**(): *boolean*

*Inherited from [CardElementContainer](_card_elements_.cardelementcontainer.md).[isSelectable](_card_elements_.cardelementcontainer.md#protected-isselectable)*

**Returns:** *boolean*

___

###  isStandalone

• **get isStandalone**(): *boolean*

*Inherited from [CardElement](_card_elements_.cardelement.md).[isStandalone](_card_elements_.cardelement.md#isstandalone)*

**Returns:** *boolean*

___

###  isVisible

• **get isVisible**(): *boolean*

*Inherited from [CardElement](_card_elements_.cardelement.md).[isVisible](_card_elements_.cardelement.md#isvisible)*

**Returns:** *boolean*

• **set isVisible**(`value`: boolean): *void*

*Inherited from [CardElement](_card_elements_.cardelement.md).[isVisible](_card_elements_.cardelement.md#isvisible)*

**Parameters:**

Name | Type |
------ | ------ |
`value` | boolean |

**Returns:** *void*

___

###  lang

• **get lang**(): *string*

*Inherited from [CardElement](_card_elements_.cardelement.md).[lang](_card_elements_.cardelement.md#lang)*

**Returns:** *string*

• **set lang**(`value`: string): *void*

*Inherited from [CardElement](_card_elements_.cardelement.md).[lang](_card_elements_.cardelement.md#lang)*

**Parameters:**

Name | Type |
------ | ------ |
`value` | string |

**Returns:** *void*

___

###  parent

• **get parent**(): *[CardElement](_card_elements_.cardelement.md)*

*Inherited from [CardElement](_card_elements_.cardelement.md).[parent](_card_elements_.cardelement.md#parent)*

**Returns:** *[CardElement](_card_elements_.cardelement.md)*

___

###  renderedElement

• **get renderedElement**(): *HTMLElement*

*Inherited from [CardElement](_card_elements_.cardelement.md).[renderedElement](_card_elements_.cardelement.md#renderedelement)*

**Returns:** *HTMLElement*

___

###  separatorElement

• **get separatorElement**(): *HTMLElement*

*Inherited from [CardElement](_card_elements_.cardelement.md).[separatorElement](_card_elements_.cardelement.md#separatorelement)*

**Returns:** *HTMLElement*

___

### `Protected` separatorOrientation

• **get separatorOrientation**(): *[Orientation](../enums/_enums_.orientation.md)*

*Inherited from [CardElement](_card_elements_.cardelement.md).[separatorOrientation](_card_elements_.cardelement.md#protected-separatororientation)*

**Returns:** *[Orientation](../enums/_enums_.orientation.md)*

___

### `Protected` supportsMinHeight

• **get supportsMinHeight**(): *boolean*

*Inherited from [CardElement](_card_elements_.cardelement.md).[supportsMinHeight](_card_elements_.cardelement.md#protected-supportsminheight)*

**Returns:** *boolean*

___

### `Protected` useDefaultSizing

• **get useDefaultSizing**(): *boolean*

*Inherited from [CardElement](_card_elements_.cardelement.md).[useDefaultSizing](_card_elements_.cardelement.md#protected-usedefaultsizing)*

**Returns:** *boolean*

## Methods

###  addImage

▸ **addImage**(`image`: [Image](_card_elements_.image.md)): *void*

**Parameters:**

Name | Type |
------ | ------ |
`image` | [Image](_card_elements_.image.md) |

**Returns:** *void*

___

### `Protected` adjustRenderedElementSize

▸ **adjustRenderedElementSize**(`renderedElement`: HTMLElement): *void*

*Inherited from [CardElement](_card_elements_.cardelement.md).[adjustRenderedElementSize](_card_elements_.cardelement.md#protected-adjustrenderedelementsize)*

**Parameters:**

Name | Type |
------ | ------ |
`renderedElement` | HTMLElement |

**Returns:** *void*

___

### `Protected` applyPadding

▸ **applyPadding**(): *void*

*Inherited from [CardElementContainer](_card_elements_.cardelementcontainer.md).[applyPadding](_card_elements_.cardelementcontainer.md#protected-applypadding)*

*Overrides [CardElement](_card_elements_.cardelement.md).[applyPadding](_card_elements_.cardelement.md#protected-applypadding)*

**Returns:** *void*

___

###  asString

▸ **asString**(): *string*

*Inherited from [CardElement](_card_elements_.cardelement.md).[asString](_card_elements_.cardelement.md#asstring)*

**Returns:** *string*

___

### `Protected` createPlaceholderElement

▸ **createPlaceholderElement**(): *HTMLElement*

*Inherited from [CardElement](_card_elements_.cardelement.md).[createPlaceholderElement](_card_elements_.cardelement.md#protected-createplaceholderelement)*

**Returns:** *HTMLElement*

___

###  getActionAt

▸ **getActionAt**(`index`: number): *[Action](_card_elements_.action.md)*

*Inherited from [CardElement](_card_elements_.cardelement.md).[getActionAt](_card_elements_.cardelement.md#getactionat)*

**Parameters:**

Name | Type |
------ | ------ |
`index` | number |

**Returns:** *[Action](_card_elements_.action.md)*

___

###  getActionById

▸ **getActionById**(`id`: string): *[Action](_card_elements_.action.md)*

*Inherited from [CardElement](_card_elements_.cardelement.md).[getActionById](_card_elements_.cardelement.md#getactionbyid)*

**Parameters:**

Name | Type |
------ | ------ |
`id` | string |

**Returns:** *[Action](_card_elements_.action.md)*

___

###  getActionCount

▸ **getActionCount**(): *number*

*Inherited from [CardElement](_card_elements_.cardelement.md).[getActionCount](_card_elements_.cardelement.md#getactioncount)*

**Returns:** *number*

___

###  getAllInputs

▸ **getAllInputs**(): *Array‹[Input](_card_elements_.input.md)›*

*Inherited from [CardElementContainer](_card_elements_.cardelementcontainer.md).[getAllInputs](_card_elements_.cardelementcontainer.md#getallinputs)*

*Overrides [CardElement](_card_elements_.cardelement.md).[getAllInputs](_card_elements_.cardelement.md#getallinputs)*

**Returns:** *Array‹[Input](_card_elements_.input.md)›*

___

###  getCustomProperty

▸ **getCustomProperty**(`name`: string): *any*

*Inherited from [SerializableObject](_card_elements_.serializableobject.md).[getCustomProperty](_card_elements_.serializableobject.md#getcustomproperty)*

**Parameters:**

Name | Type |
------ | ------ |
`name` | string |

**Returns:** *any*

___

### `Protected` getDefaultPadding

▸ **getDefaultPadding**(): *[PaddingDefinition](_shared_.paddingdefinition.md)*

*Inherited from [CardElement](_card_elements_.cardelement.md).[getDefaultPadding](_card_elements_.cardelement.md#protected-getdefaultpadding)*

**Returns:** *[PaddingDefinition](_shared_.paddingdefinition.md)*

___

###  getEffectivePadding

▸ **getEffectivePadding**(): *[PaddingDefinition](_shared_.paddingdefinition.md)*

*Inherited from [CardElement](_card_elements_.cardelement.md).[getEffectivePadding](_card_elements_.cardelement.md#geteffectivepadding)*

**Returns:** *[PaddingDefinition](_shared_.paddingdefinition.md)*

___

###  getEffectiveStyle

▸ **getEffectiveStyle**(): *string*

*Inherited from [CardElement](_card_elements_.cardelement.md).[getEffectiveStyle](_card_elements_.cardelement.md#geteffectivestyle)*

**Returns:** *string*

___

###  getElementById

▸ **getElementById**(`id`: string): *[CardElement](_card_elements_.cardelement.md)*

*Inherited from [CardElementContainer](_card_elements_.cardelementcontainer.md).[getElementById](_card_elements_.cardelementcontainer.md#getelementbyid)*

*Overrides [CardElement](_card_elements_.cardelement.md).[getElementById](_card_elements_.cardelement.md#getelementbyid)*

**Parameters:**

Name | Type |
------ | ------ |
`id` | string |

**Returns:** *[CardElement](_card_elements_.cardelement.md)*

___

###  getFirstVisibleRenderedItem

▸ **getFirstVisibleRenderedItem**(): *[CardElement](_card_elements_.cardelement.md)*

*Overrides [CardElementContainer](_card_elements_.cardelementcontainer.md).[getFirstVisibleRenderedItem](_card_elements_.cardelementcontainer.md#abstract-getfirstvisiblerendereditem)*

**Returns:** *[CardElement](_card_elements_.cardelement.md)*

___

###  getForbiddenActionTypes

▸ **getForbiddenActionTypes**(): *Array‹any›*

*Inherited from [CardElement](_card_elements_.cardelement.md).[getForbiddenActionTypes](_card_elements_.cardelement.md#getforbiddenactiontypes)*

**Returns:** *Array‹any›*

___

###  getForbiddenElementTypes

▸ **getForbiddenElementTypes**(): *Array‹string›*

*Inherited from [CardElement](_card_elements_.cardelement.md).[getForbiddenElementTypes](_card_elements_.cardelement.md#getforbiddenelementtypes)*

**Returns:** *Array‹string›*

___

### `Protected` getHasBackground

▸ **getHasBackground**(): *boolean*

*Inherited from [CardElement](_card_elements_.cardelement.md).[getHasBackground](_card_elements_.cardelement.md#protected-gethasbackground)*

**Returns:** *boolean*

___

###  getImmediateSurroundingPadding

▸ **getImmediateSurroundingPadding**(`result`: [PaddingDefinition](_shared_.paddingdefinition.md), `processTop`: boolean, `processRight`: boolean, `processBottom`: boolean, `processLeft`: boolean): *void*

*Inherited from [CardElement](_card_elements_.cardelement.md).[getImmediateSurroundingPadding](_card_elements_.cardelement.md#getimmediatesurroundingpadding)*

**Parameters:**

Name | Type | Default |
------ | ------ | ------ |
`result` | [PaddingDefinition](_shared_.paddingdefinition.md) | - |
`processTop` | boolean | true |
`processRight` | boolean | true |
`processBottom` | boolean | true |
`processLeft` | boolean | true |

**Returns:** *void*

___

###  getItemAt

▸ **getItemAt**(`index`: number): *[CardElement](_card_elements_.cardelement.md)*

*Overrides [CardElementContainer](_card_elements_.cardelementcontainer.md).[getItemAt](_card_elements_.cardelementcontainer.md#abstract-getitemat)*

**Parameters:**

Name | Type |
------ | ------ |
`index` | number |

**Returns:** *[CardElement](_card_elements_.cardelement.md)*

___

###  getItemCount

▸ **getItemCount**(): *number*

*Overrides [CardElementContainer](_card_elements_.cardelementcontainer.md).[getItemCount](_card_elements_.cardelementcontainer.md#abstract-getitemcount)*

**Returns:** *number*

___

###  getJsonTypeName

▸ **getJsonTypeName**(): *string*

*Overrides [CardElement](_card_elements_.cardelement.md).[getJsonTypeName](_card_elements_.cardelement.md#abstract-getjsontypename)*

**Returns:** *string*

___

###  getLastVisibleRenderedItem

▸ **getLastVisibleRenderedItem**(): *[CardElement](_card_elements_.cardelement.md)*

*Overrides [CardElementContainer](_card_elements_.cardelementcontainer.md).[getLastVisibleRenderedItem](_card_elements_.cardelementcontainer.md#abstract-getlastvisiblerendereditem)*

**Returns:** *[CardElement](_card_elements_.cardelement.md)*

___

### `Protected` getPadding

▸ **getPadding**(): *[PaddingDefinition](_shared_.paddingdefinition.md)*

*Inherited from [CardElement](_card_elements_.cardelement.md).[getPadding](_card_elements_.cardelement.md#protected-getpadding)*

**Returns:** *[PaddingDefinition](_shared_.paddingdefinition.md)*

___

###  getParentContainer

▸ **getParentContainer**(): *[Container](_card_elements_.container.md)*

*Inherited from [CardElement](_card_elements_.cardelement.md).[getParentContainer](_card_elements_.cardelement.md#getparentcontainer)*

**Returns:** *[Container](_card_elements_.container.md)*

___

###  getResourceInformation

▸ **getResourceInformation**(): *Array‹[IResourceInformation](../interfaces/_shared_.iresourceinformation.md)›*

*Inherited from [CardElementContainer](_card_elements_.cardelementcontainer.md).[getResourceInformation](_card_elements_.cardelementcontainer.md#getresourceinformation)*

*Overrides [CardElement](_card_elements_.cardelement.md).[getResourceInformation](_card_elements_.cardelement.md#getresourceinformation)*

**Returns:** *Array‹[IResourceInformation](../interfaces/_shared_.iresourceinformation.md)›*

___

###  getRootElement

▸ **getRootElement**(): *[CardElement](_card_elements_.cardelement.md)*

*Inherited from [CardElement](_card_elements_.cardelement.md).[getRootElement](_card_elements_.cardelement.md#getrootelement)*

**Returns:** *[CardElement](_card_elements_.cardelement.md)*

___

### `Protected` getSelectAction

▸ **getSelectAction**(): *[Action](_card_elements_.action.md)*

*Inherited from [CardElementContainer](_card_elements_.cardelementcontainer.md).[getSelectAction](_card_elements_.cardelementcontainer.md#protected-getselectaction)*

**Returns:** *[Action](_card_elements_.action.md)*

___

###  indexOf

▸ **indexOf**(`cardElement`: [CardElement](_card_elements_.cardelement.md)): *number*

*Overrides [CardElement](_card_elements_.cardelement.md).[indexOf](_card_elements_.cardelement.md#indexof)*

**Parameters:**

Name | Type |
------ | ------ |
`cardElement` | [CardElement](_card_elements_.cardelement.md) |

**Returns:** *number*

___

### `Protected` internalRender

▸ **internalRender**(): *HTMLElement*

*Overrides [CardElement](_card_elements_.cardelement.md).[internalRender](_card_elements_.cardelement.md#protected-abstract-internalrender)*

**Returns:** *HTMLElement*

___

###  internalValidateProperties

▸ **internalValidateProperties**(`context`: [ValidationResults](_card_elements_.validationresults.md)): *void*

*Inherited from [CardElementContainer](_card_elements_.cardelementcontainer.md).[internalValidateProperties](_card_elements_.cardelementcontainer.md#internalvalidateproperties)*

*Overrides [CardObject](_card_elements_.cardobject.md).[internalValidateProperties](_card_elements_.cardobject.md#internalvalidateproperties)*

**Parameters:**

Name | Type |
------ | ------ |
`context` | [ValidationResults](_card_elements_.validationresults.md) |

**Returns:** *void*

___

###  isAtTheVeryBottom

▸ **isAtTheVeryBottom**(): *boolean*

*Inherited from [CardElement](_card_elements_.cardelement.md).[isAtTheVeryBottom](_card_elements_.cardelement.md#isattheverybottom)*

**Returns:** *boolean*

___

###  isAtTheVeryLeft

▸ **isAtTheVeryLeft**(): *boolean*

*Inherited from [CardElement](_card_elements_.cardelement.md).[isAtTheVeryLeft](_card_elements_.cardelement.md#isattheveryleft)*

**Returns:** *boolean*

___

###  isAtTheVeryRight

▸ **isAtTheVeryRight**(): *boolean*

*Inherited from [CardElement](_card_elements_.cardelement.md).[isAtTheVeryRight](_card_elements_.cardelement.md#isattheveryright)*

**Returns:** *boolean*

___

###  isAtTheVeryTop

▸ **isAtTheVeryTop**(): *boolean*

*Inherited from [CardElement](_card_elements_.cardelement.md).[isAtTheVeryTop](_card_elements_.cardelement.md#isattheverytop)*

**Returns:** *boolean*

___

###  isBleeding

▸ **isBleeding**(): *boolean*

*Inherited from [CardElement](_card_elements_.cardelement.md).[isBleeding](_card_elements_.cardelement.md#isbleeding)*

**Returns:** *boolean*

___

###  isBleedingAtBottom

▸ **isBleedingAtBottom**(): *boolean*

*Inherited from [CardElement](_card_elements_.cardelement.md).[isBleedingAtBottom](_card_elements_.cardelement.md#isbleedingatbottom)*

**Returns:** *boolean*

___

###  isBleedingAtTop

▸ **isBleedingAtTop**(): *boolean*

*Inherited from [CardElement](_card_elements_.cardelement.md).[isBleedingAtTop](_card_elements_.cardelement.md#isbleedingattop)*

**Returns:** *boolean*

___

###  isBottomElement

▸ **isBottomElement**(`element`: [CardElement](_card_elements_.cardelement.md)): *boolean*

*Inherited from [CardElement](_card_elements_.cardelement.md).[isBottomElement](_card_elements_.cardelement.md#isbottomelement)*

**Parameters:**

Name | Type |
------ | ------ |
`element` | [CardElement](_card_elements_.cardelement.md) |

**Returns:** *boolean*

___

###  isDesignMode

▸ **isDesignMode**(): *boolean*

*Inherited from [CardElement](_card_elements_.cardelement.md).[isDesignMode](_card_elements_.cardelement.md#isdesignmode)*

**Returns:** *boolean*

___

### `Protected` isElementAllowed

▸ **isElementAllowed**(`element`: [CardElement](_card_elements_.cardelement.md), `forbiddenElementTypes`: Array‹string›): *boolean*

*Inherited from [CardElementContainer](_card_elements_.cardelementcontainer.md).[isElementAllowed](_card_elements_.cardelementcontainer.md#protected-iselementallowed)*

**Parameters:**

Name | Type |
------ | ------ |
`element` | [CardElement](_card_elements_.cardelement.md) |
`forbiddenElementTypes` | Array‹string› |

**Returns:** *boolean*

___

###  isFirstElement

▸ **isFirstElement**(`element`: [CardElement](_card_elements_.cardelement.md)): *boolean*

*Inherited from [CardElement](_card_elements_.cardelement.md).[isFirstElement](_card_elements_.cardelement.md#isfirstelement)*

**Parameters:**

Name | Type |
------ | ------ |
`element` | [CardElement](_card_elements_.cardelement.md) |

**Returns:** *boolean*

___

###  isHiddenDueToOverflow

▸ **isHiddenDueToOverflow**(): *boolean*

*Inherited from [CardElement](_card_elements_.cardelement.md).[isHiddenDueToOverflow](_card_elements_.cardelement.md#ishiddenduetooverflow)*

**Returns:** *boolean*

___

###  isLastElement

▸ **isLastElement**(`element`: [CardElement](_card_elements_.cardelement.md)): *boolean*

*Inherited from [CardElement](_card_elements_.cardelement.md).[isLastElement](_card_elements_.cardelement.md#islastelement)*

**Parameters:**

Name | Type |
------ | ------ |
`element` | [CardElement](_card_elements_.cardelement.md) |

**Returns:** *boolean*

___

###  isLeftMostElement

▸ **isLeftMostElement**(`element`: [CardElement](_card_elements_.cardelement.md)): *boolean*

*Inherited from [CardElement](_card_elements_.cardelement.md).[isLeftMostElement](_card_elements_.cardelement.md#isleftmostelement)*

**Parameters:**

Name | Type |
------ | ------ |
`element` | [CardElement](_card_elements_.cardelement.md) |

**Returns:** *boolean*

___

###  isRendered

▸ **isRendered**(): *boolean*

*Inherited from [CardElement](_card_elements_.cardelement.md).[isRendered](_card_elements_.cardelement.md#isrendered)*

**Returns:** *boolean*

___

###  isRightMostElement

▸ **isRightMostElement**(`element`: [CardElement](_card_elements_.cardelement.md)): *boolean*

*Inherited from [CardElement](_card_elements_.cardelement.md).[isRightMostElement](_card_elements_.cardelement.md#isrightmostelement)*

**Parameters:**

Name | Type |
------ | ------ |
`element` | [CardElement](_card_elements_.cardelement.md) |

**Returns:** *boolean*

___

###  isTopElement

▸ **isTopElement**(`element`: [CardElement](_card_elements_.cardelement.md)): *boolean*

*Inherited from [CardElement](_card_elements_.cardelement.md).[isTopElement](_card_elements_.cardelement.md#istopelement)*

**Parameters:**

Name | Type |
------ | ------ |
`element` | [CardElement](_card_elements_.cardelement.md) |

**Returns:** *boolean*

___

### `Protected` overrideInternalRender

▸ **overrideInternalRender**(): *HTMLElement*

*Inherited from [CardElement](_card_elements_.cardelement.md).[overrideInternalRender](_card_elements_.cardelement.md#protected-overrideinternalrender)*

**Returns:** *HTMLElement*

___

###  parse

▸ **parse**(`json`: any, `errors?`: Array‹[IValidationError](../interfaces/_host_config_.ivalidationerror.md)›): *void*

*Overrides [CardElementContainer](_card_elements_.cardelementcontainer.md).[parse](_card_elements_.cardelementcontainer.md#parse)*

**Parameters:**

Name | Type |
------ | ------ |
`json` | any |
`errors?` | Array‹[IValidationError](../interfaces/_host_config_.ivalidationerror.md)› |

**Returns:** *void*

___

###  remove

▸ **remove**(): *boolean*

*Inherited from [CardElement](_card_elements_.cardelement.md).[remove](_card_elements_.cardelement.md#remove)*

**Returns:** *boolean*

___

###  removeItem

▸ **removeItem**(`item`: [CardElement](_card_elements_.cardelement.md)): *boolean*

*Overrides [CardElementContainer](_card_elements_.cardelementcontainer.md).[removeItem](_card_elements_.cardelementcontainer.md#abstract-removeitem)*

**Parameters:**

Name | Type |
------ | ------ |
`item` | [CardElement](_card_elements_.cardelement.md) |

**Returns:** *boolean*

___

###  render

▸ **render**(): *HTMLElement*

*Inherited from [CardElementContainer](_card_elements_.cardelementcontainer.md).[render](_card_elements_.cardelementcontainer.md#render)*

*Overrides [CardElement](_card_elements_.cardelement.md).[render](_card_elements_.cardelement.md#render)*

**Returns:** *HTMLElement*

___

###  setCustomProperty

▸ **setCustomProperty**(`name`: string, `value`: any): *void*

*Inherited from [SerializableObject](_card_elements_.serializableobject.md).[setCustomProperty](_card_elements_.serializableobject.md#setcustomproperty)*

**Parameters:**

Name | Type |
------ | ------ |
`name` | string |
`value` | any |

**Returns:** *void*

___

### `Protected` setPadding

▸ **setPadding**(`value`: [PaddingDefinition](_shared_.paddingdefinition.md)): *void*

*Inherited from [CardElement](_card_elements_.cardelement.md).[setPadding](_card_elements_.cardelement.md#protected-setpadding)*

**Parameters:**

Name | Type |
------ | ------ |
`value` | [PaddingDefinition](_shared_.paddingdefinition.md) |

**Returns:** *void*

___

###  setParent

▸ **setParent**(`value`: [CardElement](_card_elements_.cardelement.md)): *void*

*Inherited from [CardElement](_card_elements_.cardelement.md).[setParent](_card_elements_.cardelement.md#setparent)*

*Overrides [CardObject](_card_elements_.cardobject.md).[setParent](_card_elements_.cardobject.md#abstract-setparent)*

**Parameters:**

Name | Type |
------ | ------ |
`value` | [CardElement](_card_elements_.cardelement.md) |

**Returns:** *void*

___

### `Protected` setSelectAction

▸ **setSelectAction**(`value`: [Action](_card_elements_.action.md)): *void*

*Inherited from [CardElementContainer](_card_elements_.cardelementcontainer.md).[setSelectAction](_card_elements_.cardelementcontainer.md#protected-setselectaction)*

**Parameters:**

Name | Type |
------ | ------ |
`value` | [Action](_card_elements_.action.md) |

**Returns:** *void*

___

###  setShouldFallback

▸ **setShouldFallback**(`value`: boolean): *void*

*Inherited from [CardElement](_card_elements_.cardelement.md).[setShouldFallback](_card_elements_.cardelement.md#setshouldfallback)*

**Parameters:**

Name | Type |
------ | ------ |
`value` | boolean |

**Returns:** *void*

___

###  shouldFallback

▸ **shouldFallback**(): *boolean*

*Inherited from [CardElement](_card_elements_.cardelement.md).[shouldFallback](_card_elements_.cardelement.md#shouldfallback)*

*Overrides [CardObject](_card_elements_.cardobject.md).[shouldFallback](_card_elements_.cardobject.md#abstract-shouldfallback)*

**Returns:** *boolean*

___

###  toJSON

▸ **toJSON**(): *any*

*Overrides [CardElementContainer](_card_elements_.cardelementcontainer.md).[toJSON](_card_elements_.cardelementcontainer.md#tojson)*

**Returns:** *any*

___

### `Protected` truncateOverflow

▸ **truncateOverflow**(`maxHeight`: number): *boolean*

*Inherited from [CardElement](_card_elements_.cardelement.md).[truncateOverflow](_card_elements_.cardelement.md#protected-truncateoverflow)*

**Parameters:**

Name | Type |
------ | ------ |
`maxHeight` | number |

**Returns:** *boolean*

___

### `Protected` undoOverflowTruncation

▸ **undoOverflowTruncation**(): *void*

*Inherited from [CardElement](_card_elements_.cardelement.md).[undoOverflowTruncation](_card_elements_.cardelement.md#protected-undooverflowtruncation)*

**Returns:** *void*

___

###  updateLayout

▸ **updateLayout**(`processChildren`: boolean): *void*

*Inherited from [CardElementContainer](_card_elements_.cardelementcontainer.md).[updateLayout](_card_elements_.cardelementcontainer.md#updatelayout)*

*Overrides [CardElement](_card_elements_.cardelement.md).[updateLayout](_card_elements_.cardelement.md#updatelayout)*

**Parameters:**

Name | Type | Default |
------ | ------ | ------ |
`processChildren` | boolean | true |

**Returns:** *void*

___

###  validateProperties

▸ **validateProperties**(): *[ValidationResults](_card_elements_.validationresults.md)*

*Inherited from [CardObject](_card_elements_.cardobject.md).[validateProperties](_card_elements_.cardobject.md#validateproperties)*

**Returns:** *[ValidationResults](_card_elements_.validationresults.md)*